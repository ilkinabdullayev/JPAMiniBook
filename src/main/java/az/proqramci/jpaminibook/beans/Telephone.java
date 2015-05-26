/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Proqramci
 */
@Entity
@Table(name = "TELEPHONE")
public class Telephone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int telId;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "NUMBER")
    private String number;
    
    @ManyToOne
    @JoinColumn(name = "PERSON_ID",referencedColumnName = "ID",nullable = false)
    private Person person;
    

}
