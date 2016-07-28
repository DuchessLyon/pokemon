package org.duchess.pokemon.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.duchess.pokemon.model.Caracteristic;
import org.springframework.stereotype.Service;

@Service
public class CaracteristicService {
    
    //Temporaire, en attendant les @entity
    private final HashMap<Integer,Caracteristic> caracs= new HashMap();
    private int nextId=0;
    
    public Caracteristic getRandomCarac(){
        
        double random = Math.random();
        double idRandom = random * caracs.size();
        
        int result = (int) Math.round(Math.floor(idRandom));
        
        return caracs.get(result);
    }
    
    public void createCarac(Caracteristic carac){
        caracs.put(nextId, carac);
        nextId++;
    }

    public List<Caracteristic> getAll() {
        return new ArrayList(caracs.entrySet());
    }

    public Caracteristic getCaracteristicById(int id) {
        return caracs.get(id);
    }


}
