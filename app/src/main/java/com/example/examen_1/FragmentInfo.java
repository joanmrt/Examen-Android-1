package com.example.examen_1;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentInfo extends Fragment {

    public FragmentInfo(){
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.info_fragment, container, false);
        TextView TVnombre = rootView.findViewById(R.id.nombre);
        TextView TVinfo = rootView.findViewById(R.id.informacion);
        ImageView imageView = rootView.findViewById(R.id.imageViewExercise);

        Bundle bundle = getArguments();

        assert bundle != null;
        String selectedItem = bundle.getString("selectedItem");
        TVnombre.setText(selectedItem);

        assert selectedItem != null;
        if (selectedItem.equals("Cardio")){
            TVinfo.setText("40 minutos de elíptica.");
            imageView.setImageResource(R.drawable.eliptica);
        } else if (selectedItem.equals("Piernas")) {
            TVinfo.setText("Series de 20 sentadillas.");
            imageView.setImageResource(R.drawable.sentadilla);
        } else if (selectedItem.equals("Brazos")) {
            TVinfo.setText("Series de 20 flexiones");
            imageView.setImageResource(R.drawable.pushup);
        } else if (selectedItem.equals("Resistencia")) {
            TVinfo.setText("Correr al ritmo necesario para llegar a 1h sin descanso.");
            imageView.setImageResource(R.drawable.run);

        }


        return rootView;
    }
}
