
package com.mycompany.mavenproject1;


public class Interactuables {
    private int IdObjeto;
    private String nombre;

    public Interactuables() {
    }
    
    public Interactuables(int IdObjeto, String nombre) {
        this.IdObjeto = IdObjeto;
        this.nombre = nombre;
    }

    public int getIdObjeto() {
        return IdObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdObjeto(int IdObjeto) {
        this.IdObjeto = IdObjeto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
