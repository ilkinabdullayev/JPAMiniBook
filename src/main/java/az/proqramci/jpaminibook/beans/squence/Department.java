/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.proqramci.jpaminibook.beans.squence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
@Table(name = "DEPARTMENT")
@SequenceGenerator(name = Department.CAR_SEQUENCE_NAME,sequenceName = Department.CAR_SEQUENCE_NAME,allocationSize = 5)
public class Department {
    
    public static final String CAR_SEQUENCE_NAME = "CAR_SEQUENCE_ID";
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = CAR_SEQUENCE_NAME)
    private int id;
    
    private String name;

    public Department() {
    }

    public Department(int id) {
        this.id = id;
    }    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
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
        final Department other = (Department) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }
 
}
