package com.mycompany.doggrooming.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_client;
    private String name;
    private String race;
    private String allergic;
    private String special_attention;
    private String observation;
    private String color;
    @OneToOne
    private Owner oneOwner;

    public Pet() {
    }

    public Pet(int num_client, String name, String race, String allergic, String special_attention, String observation, String color, Owner oneOwner) {
        this.num_client = num_client;
        this.name = name;
        this.race = race;
        this.allergic = allergic;
        this.special_attention = special_attention;
        this.observation = observation;
        this.color = color;
        this.oneOwner = oneOwner;
    }

    public int getNum_client() {
        return num_client;
    }

    public void setNum_client(int num_client) {
        this.num_client = num_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecial_attention() {
        return special_attention;
    }

    public void setSpecial_attention(String special_attention) {
        this.special_attention = special_attention;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Owner oneOwner) {
        this.oneOwner = oneOwner;
    }

   
    
    
}
