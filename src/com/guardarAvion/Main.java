package com.guardarAvion;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArchivoAviones archivoAviones = new ArchivoAviones();
        ArrayList<Avion> aviones = archivoAviones.traerAviones();

        for (Avion a : aviones) {
            System.out.println(a.toString());
        }
    }
}

