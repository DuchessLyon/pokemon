package org.duchess.pokemon.controller;

import java.util.List;
import org.duchess.pokemon.model.Caracteristic;
import org.duchess.pokemon.service.CaracteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/caracteristic")
public class CaracteristicController {
    
    @Autowired
    private CaracteristicService caracteristicService;
    
    @RequestMapping(value = "/random", method = RequestMethod.GET)
    @ResponseBody
    public Caracteristic getRandomCarac() {
        return caracteristicService.getRandomCarac();
    }
    
    
    /**
     * 
     * @param id
     * @return 
     */
    @RequestMapping(value = "/{id}")
    public Caracteristic getCaracteristicById(@RequestParam int id){
        return caracteristicService.getCaracteristicById(id);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @RequestMapping(value = "/all")
    public List<Caracteristic> getAllCaracteristic(){
        return caracteristicService.getAll();
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Carac is here";
    }
    
}
