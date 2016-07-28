package org.duchess.pokemon.model;

import java.util.ArrayList;

public class Player {
    
    private int id;
    private String pseudo;
    private ArrayList<Pokemon> pokemons;
    
    //position x et y sur le jeu
    private int x;
    private int y;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    
}
