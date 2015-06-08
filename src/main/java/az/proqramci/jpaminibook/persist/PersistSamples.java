/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.persist;

import az.proqramci.jpaminibook.beans.Person;
import az.proqramci.jpaminibook.beans.Telephone;
import az.proqramci.jpaminibook.beans.compositykey.complex.Dog;
import az.proqramci.jpaminibook.beans.compositykey.complex.DogHouse;
import az.proqramci.jpaminibook.beans.mapping.collection.Persons;
import az.proqramci.jpaminibook.beans.mapping.joined.Guardians;
import az.proqramci.jpaminibook.beans.mapping.joined.Hero;
import az.proqramci.jpaminibook.beans.squence.Department;
import az.proqramci.jpaminibook.beans.squence.Job;
import az.proqramci.jpaminibook.enums.State;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;

/**
 *
 * @author Ilkin Abdullayev
 */
public class PersistSamples {

    private EntityManager entityManager = null;

    public PersistSamples(EntityManager entityManager) {
        this.entityManager = entityManager;
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
        DogHouse dogHouse = new DogHouse();

        Dog dog = new Dog();
        dog.setId(5);
        dog.setName("Pitbull");

        dogHouse.setDog(dog);
        dogHouse.setBrand("Brand55");

        entityManager.getTransaction().begin();
        entityManager.persist(dogHouse);
        entityManager.getTransaction().commit();
        close();
    }

    public void persistMethodFourth() {
        Guardians guardians = new Guardians();
        guardians.setName("Grood");
        guardians.setHugePooWeight(15545);

        entityManager.getTransaction().begin();
        entityManager.persist(guardians);
        entityManager.getTransaction().commit();
        close();
    }

    public void persistMethodFifth() {
        Hero hero = new Hero();
        hero.setName("Grood");
        hero.setHugePooWeight(15545);
        hero.setRating(8.7);

        entityManager.getTransaction().begin();
        entityManager.persist(hero);
        entityManager.getTransaction().commit();
        close();
    }

    public void persistMethodSixth() {
        Persons persons = new Persons();
        persons.setName("Ilkin");

        Set<String> emails = new HashSet<String>();
        emails.add("ilkinabdullayev6@gmail.com");
        emails.add("ilkinabdullayev6@hotmail.com");
        emails.add("i.abdullayev@idrak.az");
        persons.setEmails(emails);

        Set<State> states = new HashSet<State>();
        states.add(State.COOL);
        states.add(State.HAPPY);
        persons.setStates(states);

        entityManager.getTransaction().begin();
        entityManager.persist(persons);
        entityManager.getTransaction().commit();
        close();
    }

    public void persistMethodSeventh() {

        Person person = new Person();
        person.setName("Ilkin");
        person.setAge(23);
        person.setSurname("Abdullayev");

        List<Telephone> tels = new ArrayList<Telephone>();
//        Telephone telephone = new Telephone();
//        telephone.setNumber("051-417-88-17");
//        telephone.setPerson(person);
//        telephone.setType("MOBILE");
//        tels.add(telephone);

        Telephone telephone1 = new Telephone();
        telephone1.setNumber("012-594-07-80");
        telephone1.setPerson(person);
        telephone1.setType("HOME");
        tels.add(telephone1);

        person.setTelephones(tels);

        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
        close();
    }

    private void close() {
        entityManager.close();
    }
}
