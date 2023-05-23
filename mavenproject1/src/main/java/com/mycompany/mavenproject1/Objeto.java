
package com.mycompany.mavenproject1;


public class Objeto implements Interactuable{
    
    private int tipoObjeto;
    private String nombre;
    private int idObjeto;
    
    public Objeto() {
    }

    public Objeto(int tipoObjeto, String nombre, int idObjeto) {
        this.tipoObjeto = tipoObjeto;
        this.nombre = nombre;
        this.idObjeto = idObjeto;
    }
    
 
    
    

    public int getTipoObjeto() {
        return tipoObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    
    public void setTipoObjeto(int tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    
    
    @Override
    public boolean usar(){
        return false;
    }

    @Override
    public void imprimir() {
        
    }

    @Override
    public void eliminar() {
        
    }
    
    
}
