package com.mycompany.doggrooming.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_owner;
    private String name;
    private String cellPhone;
    
    public Owner() {
    }
    
    public Owner(int id_owner, String name, String cellPhone) {
        this.id_owner = id_owner;
        this.name = name;
        this.cellPhone = cellPhone;
    }

    @Override
    public String toString() {
        return "Owner{" + "id_owner=" + id_owner + ", name=" + name + ", cellPhone=" + cellPhone + '}';
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
