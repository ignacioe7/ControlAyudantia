
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;


public class Pokedex extends Inventario{
    ArrayList<Pokemon> pokemones = new ArrayList<>();
    
    public Pokedex() {
    }

    public Pokedex(int capacidad) {
        super(capacidad);
        pokemones = new ArrayList<>();
    }
    
    
    
    public void elegirPokemon(int id){
        //Inventario inventario = new Inventario();
        
        for(int i=0; i<pokemones.size(); i++){
            if(pokemones.get(i).getId()==id){
                System.out.println(pokemones.get(i).getNombre());
            }
        }
        
    }
    
    @Override
    public void crear(){
        int id;
        String nombre;
        int nivel;
        int vida;
        ArrayList<Habilidad> ataques = new ArrayList<>();
        Tipo_Pokemon tipoPokemon;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("id = ");
        id = entrada.nextInt();
        System.out.println("nombre = ");
        nombre = entrada.next();
        System.out.println("vida = ");
        vida = entrada.nextInt();
        System.out.println("nivel");
        nivel = entrada.nextInt();
        System.out.println("ataque");
        tipoPokemon = Tipo_Pokemon.valueOf(entrada.next());
        System.out.println("tipo = ");
        
        
        pokemones.add(new Pokemon(tipoPokemon, ataques, vida, nivel, id, nombre));
        
        
    }
    
    
    @Override
    public void imprimir(String nombre){
        
        for(int i=0; i<pokemones.size(); i++){
            
            if(pokemones.get(i).getNombre().equals(nombre)){
                System.out.println("Nombre del pokemon: " +pokemones.get(i).getNombre());
            }else{
                System.out.println("El pokemon no existe");
            }
        }
        
    }
    
}
