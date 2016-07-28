package org.duchess.pokemon;

import javax.annotation.PostConstruct;
import org.duchess.pokemon.model.Caracteristic;
import org.duchess.pokemon.model.Pokemon;
import org.duchess.pokemon.service.CaracteristicService;
import org.duchess.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Génération du jeu de données.
 */
@Service
public class DataInitializer {
    
    @Autowired
    private CaracteristicService caracteristicService;
    
    @Autowired
    private PokemonService pokemonService;
    
    @PostConstruct
    public void initAllData(){
        initPokemonCaracteristics();
        initPokemon();
    }
    
    public void initPokemonCaracteristics(){
        Caracteristic tortank = new Caracteristic();
        tortank.setName("Tortank");
        tortank.setDescription("Tortank dispose de canons a eau émergeant de sa carapace. Ils sont très précis et peuvent envoyer des balles d'eau capable de faire mouche sur une cible située à plus de 50m.");
        tortank.setImageName("009.png");
        tortank.setSize(1.6f);
        tortank.setWeight(85.5f);
        caracteristicService.createCarac(tortank);
        
        Caracteristic carabaffe = new Caracteristic();
        carabaffe.setName("Carabaffe");
        carabaffe.setDescription("Carabaffe a une large queue recouverte d'une épaisse fourrure. Elle devient de plus en plus foncée avec l'âge. Les éraflures sur la carapace de ce pokémon témoignent de son expérience au combat.");
        carabaffe.setImageName("008.png");
        carabaffe.setSize(1.0f);
        carabaffe.setWeight(22.5f);
        carabaffe.setNextCaracteristic(tortank);
        carabaffe.setNextLevel(20);
        caracteristicService.createCarac(carabaffe);
        
        Caracteristic carapuce = new Caracteristic();
        carapuce.setName("Carapuce");
        carapuce.setDescription("La carapace de Carapuce ne sert qu'à le protéger. La forme ronde de sa carapace et ses rainures lui permettent d'améliorer son hydrodynamisme. Ce pokémon nage extrèmement vite.");
        carapuce.setImageName("007.png");
        carapuce.setSize(0.5f);
        carapuce.setWeight(9.0f);
        carapuce.setNextCaracteristic(carabaffe);
        carapuce.setNextLevel(10);
        caracteristicService.createCarac(carapuce);
        
        Caracteristic pichu = new Caracteristic();
        pichu.setName("Pichu");
        pichu.setDescription("Pichu se charge plus facilement en electricité les jours d'orage ou lorsque l'air est très sec. On peut entendre le crépitement de l'électricité statique générée par ce pokémon.");
        pichu.setImageName("172png");
        pichu.setSize(0.3f);
        pichu.setWeight(9.0f);
        pichu.setNextCaracteristic(carabaffe);
        pichu.setNextLevel(10);
        caracteristicService.createCarac(pichu);
    }
    
    public void initPokemon()
    {
        pokemonService.getRandomPokemon();
    }
}
