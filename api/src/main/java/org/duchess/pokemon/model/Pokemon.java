package org.duchess.pokemon.model;

import java.util.Date;

/**
 * Représente un pokémon "vivant".
 * @author winry
 */
public class Pokemon {
    
    private Caracteristic caracteristic;
    
    private Date birthdate;
    
    private Gender gender;
    
    private int id;
    
    //Niveau pour l'évolution
    private int level=0;

    public Caracteristic getCaracteristic() {
        return caracteristic;
    }

    public void setCaracteristic(Caracteristic caracteristic) {
        this.caracteristic = caracteristic;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


