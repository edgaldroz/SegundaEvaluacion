package com.ar.segundaevaluacion;

import android.graphics.Bitmap;

/**
 * Created by Adalberto on 04/11/2017.
 */

public class Datos {

    private Bitmap Img;
    private String Ruta;

    public Datos(String ruta, Bitmap img ) {
        Img = img;
        Ruta = ruta;
    }
    public Datos (){

    }

    public Bitmap getImg() {
        return Img;
    }

    public void setImg(Bitmap img) {
        Img = img;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String ruta) {
        Ruta = ruta;
    }
}
