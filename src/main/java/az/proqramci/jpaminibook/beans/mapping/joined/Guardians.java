/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.proqramci.jpaminibook.beans.mapping.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Ilkin Abdullayev
 */

@Entity
//@DiscriminatorValue(value = "GUARDIANS")
public class Guardians extends Galaxy{
    
    private int hugePooWeight;

    public int getHugePooWeight() {
        return hugePooWeight;
    }

    public void setHugePooWeight(int hugePooWeight) {
        this.hugePooWeight = hugePooWeight;
    }
    
}
