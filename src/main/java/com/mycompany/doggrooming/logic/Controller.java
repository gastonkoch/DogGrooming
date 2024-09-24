package com.mycompany.doggrooming.logic;

import com.mycompany.doggrooming.persistence.PersistenceController;
import java.util.List;

public class Controller {
        PersistenceController persisController = new PersistenceController();

        public void save(String color, String name, String nameOwner, String observation, String phoneOwner, String race, String alergic, String specialAttention) {
            Owner owner = new Owner();
            owner.setName(nameOwner);
            owner.setCellPhone(phoneOwner);

            Pet pet = new Pet();
            pet.setName(name);
            pet.setAllergic(alergic);
            pet.setSpecial_attention(specialAttention);
            pet.setRace(race);
            pet.setObservation(observation);
            pet.setColor(color);
            pet.setOneOwner(owner);

            persisController.save(owner,pet);
        }

        public List<Pet> getPets() {
            return persisController.getPets();
        }

        public void deletePet(int num_client) {
            persisController.deletePet(num_client);
        }

        public Pet getPetById(int num_client) {
            return persisController.getPetById(num_client);
        }

        public void updatePetAndOwner(Pet newPet, String petName, String petColor, String petObservation, String petRace, 
                String petAlergic, String petSpecialAttention, String petOwnerName, String petOwnerPhone) {
                
                newPet.setName(petName);
                newPet.setAllergic(petAlergic);
                newPet.setColor(petColor);
                newPet.setObservation(petObservation);
                newPet.setRace(petRace);
                newPet.setSpecial_attention(petSpecialAttention);
                
                persisController.updatePet(newPet);
                
                
                Owner owner = this.getOwnerById(newPet.getOneOwner().getId_owner());
                owner.setName(petOwnerName);
                owner.setCellPhone(petOwnerPhone);
                
                this.updateOwner(owner);
                
        }

        private Owner getOwnerById(int id_owner) {
            return persisController.getOwnerById(id_owner);
        }

        private void updateOwner(Owner owner) {
            persisController.updateOwner(owner);
        }
        
        
    
    }
