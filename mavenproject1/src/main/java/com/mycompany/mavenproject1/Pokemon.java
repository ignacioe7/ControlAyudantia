
package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Pokemon extends Interactuables{
    
    private Tipo_Pokemon tipoPokemon;
    private ArrayList<Habilidad> ataques;
    private int vida;
    private int nivel;

    public Pokemon(Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel) {
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
    }
    
    
    
    public Pokemon(Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel, int IdObjeto, String nombre) {
        super(IdObjeto, nombre);
        
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
    }

    
    

    public Pokemon() {
    }
    
    

    public Tipo_Pokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public ArrayList<Habilidad> getAtaques() {
        return ataques;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }
    
    public void setTipoPokemon(Tipo_Pokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public void setAtaques(ArrayList<Habilidad> ataques) {
        this.ataques = ataques;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
}
