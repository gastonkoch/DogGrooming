package com.mycompany.doggrooming.persistence;

import com.mycompany.doggrooming.logic.Owner;
import com.mycompany.doggrooming.logic.Pet;
import com.mycompany.doggrooming.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    public OwnerJpaController ownerJpa = new OwnerJpaController();
    public PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        ownerJpa.create(owner);
        petJpa.create(pet);
    }

    public List<Pet> getPets() {
        return petJpa.findPetEntities();
    }

    public void deletePet(int num_client) {
        try {
            petJpa.destroy(num_client);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pet getPetById(int num_client) {
        return petJpa.findPet(num_client);
    }

    public void updatePet(Pet newPet) {
        try {
            petJpa.edit(newPet);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner getOwnerById(int id_owner) {
        return ownerJpa.findOwner(id_owner);
    }

    public void updateOwner(Owner owner) {
        try {
            ownerJpa.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
