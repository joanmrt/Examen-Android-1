package com.example.examen_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentList extends Fragment {

    public FragmentList(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);
        ListView listView = rootView.findViewById(R.id.listView);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Cardio");
        lista.add("Piernas");
        lista.add("Brazos");
        lista.add("Resistencia");
        lista.add("Cardio Intensivo");


        Adapter adapter = new Adapter(lista, requireContext());

        listView.setAdapter(adapter);

        return rootView;
    }

}