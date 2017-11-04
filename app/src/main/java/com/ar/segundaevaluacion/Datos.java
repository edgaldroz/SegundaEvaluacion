package com.ar.segundaevaluacion;

import android.graphics.Bitmap;

/**
 * Created by Adalberto on 04/11/2017.
 */

public class Datos {

    private String Id;
    private Bitmap Img;
    private String Ruta;

    public Datos(String ruta, Bitmap img ) {
        ;
        setImg(img);
        setRuta(ruta);
    }
    public Datos (){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
