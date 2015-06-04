/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.proqramci.jpaminibook.beans.mapping;

import az.proqramci.jpaminibook.beans.mapping.collection.Persons;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
public class Cellular {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int number;
    
    @OneToOne(mappedBy = "cellular",targetEntity = Persons.class)
    private Persons persons;
    
    @OneToMany(mappedBy = "cellular",targetEntity = Call.class,fetch = FetchType.LAZY)
    private List<Call> listCalls;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Persons getPersons() {
        return persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public List<Call> getListCalls() {
        return listCalls;
    }

    public void setListCalls(List<Call> listCalls) {
        this.listCalls = listCalls;
    }
    
    
    
    
}
