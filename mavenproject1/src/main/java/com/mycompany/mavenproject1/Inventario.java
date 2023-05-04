
package com.mycompany.mavenproject1;

import java.util.ArrayList;


public class Inventario {
    private int capacidad;
    private ArrayList<Interactuables> ListaObjetos = new ArrayList<>();

    public Inventario() {
    }

    public Inventario(int capacidad) {
        this.capacidad = capacidad;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Interactuables> getListaObjetos() {
        return ListaObjetos;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaObjetos(ArrayList<Interactuables> ListaObjetos) {
        this.ListaObjetos = ListaObjetos;
    }
    
    
    
    
    
    public void crearInventario(){
        
    }
    
    public void imprimirInventario(int IdObjeto){
        
        for(int i=0; i<ListaObjetos.size(); i++){
            
            if(ListaObjetos.get(i).getIdObjeto()== IdObjeto){
                System.out.println("Nombre del objeto: " +ListaObjetos.get(i).getNombre());
            }else{
                System.out.println("El objeto no existe");
            }
        }
        
    }
    
    public void modificarInventario(int IdObjeto){
        for(int i=0; i<ListaObjetos.size(); i++){
            if(ListaObjetos.get(i).getIdObjeto() == IdObjeto){
                ListaObjetos.remove(i);
                
            }else{
                System.out.println("El objeto no existe");
            }
        }
    }
    public void eliminarInventario(int IdObjeto){
        for(int i=0; i<ListaObjetos.size(); i++){
            if(ListaObjetos.get(i).getIdObjeto() == IdObjeto){
                ListaObjetos.remove(i);
            }
        }
    }
}
