package org.duchess.pokemon.controller;

import org.duchess.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/game")
public class GameController  {
    
    @Autowired
    private PokemonService gameService;
    
    @RequestMapping(value = "/newplayer", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Pika pika !";
    }
    
}
