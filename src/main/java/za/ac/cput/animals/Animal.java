/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.animals;

/**
 *
 * @author Levi
 * Student Number 218250142
 * 
 */
public class Animal {
private String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" + "animalName=" + animalName + '}';
    }
  
}
