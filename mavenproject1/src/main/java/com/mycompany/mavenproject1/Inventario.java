
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;


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
    
    
    
    
    
    public void crear(){
        int idObjeto;
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la id: ");
        idObjeto = entrada.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        
        ListaObjetos.add(new Interactuables(idObjeto, nombre));
        
        
    }
    
    public void imprimir(int IdObjeto){
        
        for(int i=0; i<ListaObjetos.size(); i++){
            
            if(ListaObjetos.get(i).getIdObjeto()== IdObjeto){
                System.out.println("Nombre del objeto: " +ListaObjetos.get(i).getNombre());
            }else{
                System.out.println("El objeto no existe");
            }
        }
        
    }
    
    public void modificar(int IdObjeto){
        for(int i=0; i<ListaObjetos.size(); i++){
            if(ListaObjetos.get(i).getIdObjeto() == IdObjeto){
                ListaObjetos.remove(i);
                crear();
            }else{
                System.out.println("El objeto no existe");
            }
        }
    }
    public void eliminar(int IdObjeto){
        for(int i=0; i<ListaObjetos.size(); i++){
            if(ListaObjetos.get(i).getIdObjeto() == IdObjeto){
                ListaObjetos.remove(i);
            }
        }
    }
}
