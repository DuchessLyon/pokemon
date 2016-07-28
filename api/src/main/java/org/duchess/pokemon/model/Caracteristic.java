package org.duchess.pokemon.model;

/**
 * LEs caractèristique du type de pokémon. Ces caractéristiques sont utilisées à la naissance du pokémon.
 * @author winry
 */
public class Caracteristic{
    
    private int id;
    private String name;
    private String imageName;
    private String description;
    private float size;
    private float weight;
    private int nextLevel;
    private Caracteristic nextCaracteristic;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }

    public Caracteristic getNextCaracteristic() {
        return nextCaracteristic;
    }

    public void setNextCaracteristic(Caracteristic nextCaracteristic) {
        this.nextCaracteristic = nextCaracteristic;
    }
    

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    
    public void setName(String _name){
        this.name = _name;
    }
    
    public String getName(){
        return this.name;
    }
    
}
