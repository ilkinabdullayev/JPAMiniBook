/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.proqramci.jpaminibook.beans.compositykey.complex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
@SecondaryTables({
@SecondaryTable(name = "DOG_SECONDARY_A",pkJoinColumns = {@PrimaryKeyJoinColumn(name = "DOG_ID")}),
@SecondaryTable(name = "DOG_SECONDARY_B",pkJoinColumns = {@PrimaryKeyJoinColumn(name = "DOG_ID")})
})
public class Dog {
    
    @Id
    private int id;
    
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
}
