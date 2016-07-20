package org.duchess.pokemon.controller;

import org.duchess.pokemon.model.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/pokemon")
public class PokemonController  {
    
    @RequestMapping(value = "/random", method = RequestMethod.GET)
    @ResponseBody
    public Pokemon getRandomPokemon() {
        Pokemon duchessmon = new Pokemon();
        duchessmon.setName("Duchessmon");
        
        return duchessmon;
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Pika pika !";
    }
    
}
