/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.beans.compositykey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
@Table(name = "ADDRESS")
@IdClass(AddressId.class)
public class Address {

    @Id
    private String coordinant;
    
    @Id
    private String fullPath;

    private String name;

    public String getCoordinant() {
        return coordinant;
    }

    public void setCoordinant(String coordinant) {
        this.coordinant = coordinant;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }  
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
