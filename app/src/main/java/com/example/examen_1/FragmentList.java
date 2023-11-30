package com.example.examen_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class FragmentList extends Fragment {

    public FragmentList(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);
        ListView listView = rootView.findViewById(R.id.listView);

        ArrayList<ItemList> lista = new ArrayList<>();
        lista.add(new ItemList("Cardio", R.drawable.eliptica));
        lista.add(new ItemList("Piernas", R.drawable.sentadilla));
        lista.add(new ItemList("Brazos", R.drawable.pushup));
        lista.add(new ItemList("Resistencia", R.drawable.run));


        Adapter adapter = new Adapter(lista, requireContext());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = lista.get(position).getText();
                // Call a method to handle item click and navigate to AnotherFragment
                handleItemClickAndNavigate(selectedItem);
            }
        });

        return rootView;
    }

    public void handleItemClickAndNavigate(String item_seleccionado){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Pass any data you want to AnotherFragment using arguments
        Bundle bundle = new Bundle();
        bundle.putString("selectedItem", item_seleccionado);

        FragmentInfo frag_info = new FragmentInfo();
        frag_info.setArguments(bundle);

        // Replace the current fragment with AnotherFragment
        fragmentTransaction.replace(R.id.fragmentContainerView, frag_info);
        // Add the transaction to the back stack to allow back navigation
        fragmentTransaction.addToBackStack(null);
        // Commit the transaction
        fragmentTransaction.commit();
    }

}