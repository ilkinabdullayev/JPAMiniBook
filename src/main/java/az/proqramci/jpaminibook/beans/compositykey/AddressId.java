/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.beans.compositykey;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author Ilkin Abdullayev
 */
@Embeddable
public class AddressId implements Serializable {

    private static final long serialVersionUID = 1L;


    private String coordinant;
    private String fullPath;

    public AddressId() {
    }

    public AddressId(String coordinant, String fullPath) {
        this.coordinant = coordinant;
        this.fullPath = fullPath;
    }   
    

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.coordinant);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AddressId other = (AddressId) obj;
        if (!Objects.equals(this.coordinant, other.coordinant)) {
            return false;
        }
        return true;
    }

}
