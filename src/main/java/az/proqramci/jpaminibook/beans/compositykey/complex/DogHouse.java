/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.proqramci.jpaminibook.beans.compositykey.complex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Administrator
 */
@Entity
public class DogHouse {
    
    @Id
    @OneToOne
    @JoinColumn(name = "DOG_ID")
    private Dog dog;
    
    private String brand;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }   
    
    
}
