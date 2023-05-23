
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;


public class Mochila extends Inventario{
    
    ArrayList<Objeto> ListaObjetos = new ArrayList<>();
    
    
    
    
    public Mochila(){
    }

    public Mochila(int capacidad) {
        super(capacidad);
    }
    
    
    public void usar(int id){
        for(int i=0; i<ListaObjetos.size(); i++){
            if(ListaObjetos.get(i).getIdObjeto()==id){
                System.out.println("Objeto usado" + ListaObjetos.get(i).getNombre());
                super.getListaObjetos().remove(i);
                
            }
        }
    }
    @Override
    public void crear(){
        int tipo, id;
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo: ");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el tipo: ");
        id = entrada.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        
        ListaObjetos.add(new Objeto(tipo, nombre, id));
        
        
    }
    
    
    @Override
    public void imprimir(String nombre){
        
        for(int i=0; i<ListaObjetos.size(); i++){
            
            if(ListaObjetos.get(i).getNombre().equals(nombre)){
                System.out.println("Nombre del objeto: " +ListaObjetos.get(i).getNombre());
            }else{
                System.out.println("El objeto no existe");
            }
        }
        
    }

    
    
    
    
}
