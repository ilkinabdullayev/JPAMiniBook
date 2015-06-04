/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.proqramci.jpaminibook.beans.mapping.collection;

import az.proqramci.jpaminibook.beans.mapping.Cat;
import az.proqramci.jpaminibook.beans.mapping.Cellular;
import az.proqramci.jpaminibook.enums.State;
import java.util.List;
import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
@Table(name = "PERSONS")
public class Persons {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    @ElementCollection
    @CollectionTable(name = "PERSONS_HAS_EMAILS",joinColumns = {@JoinColumn(name = "PERSON_ID")})
    private Set<String> emails;
    
    @ElementCollection(targetClass = State.class)
    @Enumerated(EnumType.STRING)
    private Set<State> states;
    
    @OneToOne
    @JoinColumn(name = "CELLUAR_ID")
    private Cellular cellular;
    
    @ManyToMany
    @JoinTable(name = "persons_cat",joinColumns = @JoinColumn(name = "person_id"),inverseJoinColumns = @JoinColumn(name = "cat_id"))
    private List<Cat> listCats;

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

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    public Set<State> getStates() {
        return states;
    }

    public void setStates(Set<State> states) {
        this.states = states;
    }
  
    
}
