
package com.mycompany.mavenproject1;

import java.util.ArrayList;


public class Pokedex extends Inventario{

    public Pokedex() {
    }

    public Pokedex(int capacidad) {
        super(capacidad);
    }
    
    
    
    public void elegirPokemon(int idObjeto){
        //Inventario inventario = new Inventario();
        
        for(int i=0; i<super.getListaObjetos().size(); i++){
            if(super.getListaObjetos().get(i).getIdObjeto()==idObjeto){
                System.out.println(super.getListaObjetos().get(i).getNombre());
            }
        }
        
    }
}
