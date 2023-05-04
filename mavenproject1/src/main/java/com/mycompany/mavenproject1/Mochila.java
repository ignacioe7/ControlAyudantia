
package com.mycompany.mavenproject1;


public class Mochila extends Inventario{

    
    public Mochila() {
    }

    public Mochila(int capacidad) {
        super(capacidad);
    }

    
    public void usar(int id){
        for(int i=0; i<super.getListaObjetos().size(); i++){
            if(super.getListaObjetos().get(i).getIdObjeto()==id){
                System.out.println("Objeto usado" + super.getListaObjetos().get(i).getNombre());
                super.getListaObjetos().remove(i);
                
            }
        }
    }
    
    
    
}
