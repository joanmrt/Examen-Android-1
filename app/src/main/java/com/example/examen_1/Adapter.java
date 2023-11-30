package com.example.examen_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private final ArrayList<ItemList> lista;
    private final Context context;

    public Adapter(ArrayList<ItemList> lista, Context context){
        this.context = context;
        this.lista = lista;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_items, null);
        }

        TextView textViewItem = view.findViewById(R.id.textViewItem);
        textViewItem.setText(lista.get(position).getText());

        ImageView imageViewItem = view.findViewById(R.id.imageView);
        imageViewItem.setImageResource(lista.get(position).getImageResId());

        return view;
    }
}
