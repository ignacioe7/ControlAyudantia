
package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Pokemon implements Interactuable{
    
    private Tipo_Pokemon tipoPokemon;
    private ArrayList<Habilidad> ataques;
    private int vida;
    private int nivel;
    private int id;
    private String nombre;

    public Pokemon(Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel, int id, String nombre) {
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
        this.id = id;
        this.nombre = nombre;
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

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    

    @Override
    public void imprimir() {
        
    }

    @Override
    public boolean usar() {
        return false;
    }

    @Override
    public void eliminar() {
        
    }
    
    
    
}
