/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.persist;

import az.proqramci.jpaminibook.beans.compositykey.complex.Dog;
import az.proqramci.jpaminibook.beans.compositykey.complex.DogHouse;
import az.proqramci.jpaminibook.beans.squence.Department;
import az.proqramci.jpaminibook.beans.squence.Job;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ilkin Abdullayev
 */
public class PersistSamples {
  
    private EntityManager entityManager = null;

    public PersistSamples(EntityManager entityManager) {    
        this.entityManager=entityManager;
    }

    public void persistMethodFirst() {
        Department department = new Department();

        entityManager.getTransaction().begin();

        for (int i = 1; i < 40; i++) {
            department = new Department();
            department.setName("IT" + i);
            entityManager.persist(department);
        }

        entityManager.getTransaction().commit();

        close();
    }

    public void persistMethodSecond() {
        Department department = null;
        Job job = null;
        entityManager.getTransaction().begin();

        department = new Department();
        department.setName("IT");
        entityManager.persist(department);

        job = new Job();
        job.setName("Software Developer");
        entityManager.persist(job);

        entityManager.getTransaction().commit();
    }

    public void persistMethodThird() {
        DogHouse dogHouse=new DogHouse();
        
        Dog dog=new Dog();
        dog.setId(5);
        dog.setName("Pitbull");
        
        dogHouse.setDog(dog);
        dogHouse.setBrand("Brand55");
        
        entityManager.getTransaction().begin();
        entityManager.persist(dogHouse);
        entityManager.getTransaction().commit();
        close();
    }

    private void close() {
        entityManager.close();        
    }   
}
