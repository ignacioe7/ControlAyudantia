
package com.mycompany.mavenproject1;


public class Objeto extends Interactuables{
    
    private String tipoObjeto;

    public Objeto() {
    }

    public Objeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }
    
    
    public Objeto(String tipoObjeto, int IdObjeto, String nombre) {
        super(IdObjeto, nombre);
        this.tipoObjeto = tipoObjeto;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }
    
    
    
    
    
}
