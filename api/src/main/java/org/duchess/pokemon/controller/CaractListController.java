package org.duchess.pokemon.controller;

import java.util.List;
import org.duchess.pokemon.model.Caracteristic;
import org.duchess.pokemon.service.CaracteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Page html de rendu.
 */
@Controller
public class CaractListController {
    
    @Autowired
    private CaracteristicService caracteristiqueService;
    
    @RequestMapping(value = "/html/caracteristique", method = RequestMethod.GET)
    @ResponseBody
    public String html(){
        
        List<Caracteristic> caracs = caracteristiqueService.getAll();
        
        /*String result = "<body>";
        result+=carac.getName();
        result+="<img src=\"/img/"+carac.getImageName()+"\"/>";
        result+="</body>";*/
        return "pas fait.";
    }
    
}
