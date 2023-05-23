
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Inventario {
    private int capacidad;
    ArrayList<Objeto> ListaObjetos = new ArrayList<>();
    
    public Inventario() {
    }
    
    public Inventario(int capacidad) {
        this.capacidad = capacidad;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Objeto> getListaObjetos() {
        return ListaObjetos;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaObjetos(ArrayList<Objeto> ListaObjetos) {
        this.ListaObjetos = ListaObjetos;
    }
    
    
    public abstract void crear();
    public abstract void imprimir(String nombre);
    
    
}
