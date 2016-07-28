package org.duchess.pokemon.service;

import java.util.Date;
import java.util.HashMap;
import org.duchess.pokemon.model.Caracteristic;
import org.duchess.pokemon.model.Gender;
import org.duchess.pokemon.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    
    @Autowired
    private CaracteristicService caracteristicService;
    
    private HashMap<Integer,Pokemon> data=new HashMap();
    private int nextId=0;
    
    public Pokemon getRandomPokemon(){
        
        Pokemon newBornPokemon = new Pokemon();
        
        //pick one carac
        Caracteristic pokemonCarac = caracteristicService.getRandomCarac();
        newBornPokemon.setCaracteristic(pokemonCarac);
        
        //pick one gender
        double randomGender = Math.random();
        if(randomGender>.5f)
        {
            newBornPokemon.setGender(Gender.FEMELLE);
        }
        else
        {
            newBornPokemon.setGender(Gender.MALE);
        }
        
        //pokemon is born now
        newBornPokemon.setBirthdate(new Date());
        newBornPokemon.setId(nextId);
        nextId++;
        
        data.put(newBornPokemon.getId(), newBornPokemon);
        
        return newBornPokemon;
    }
    
}
