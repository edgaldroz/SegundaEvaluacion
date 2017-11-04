package com.ar.segundaevaluacion;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Adalberto on 04/11/2017.
 */

public class Adaptador extends ArrayAdapter<Datos> {
    public Adaptador(Context context,List<Datos> objects) {
        super(context, 0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Datos datos = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }
        TextView lblId = (TextView) convertView.findViewById(R.id.id);
        TextView lblRuta = (TextView) convertView.findViewById(R.id.lblRuta);
        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        // mostrar los datos
        lblId.setText((position+1)+"");
        lblRuta.setText(datos.getRuta());
        img.setImageBitmap(datos.getImg());
        // lblFecha.setText(mensaje.fecha);
        // Return la convertView ya con los datos

        return convertView;
    }
}
