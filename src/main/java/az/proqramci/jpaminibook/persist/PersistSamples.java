/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.persist;

import az.proqramci.jpaminibook.beans.Person;
import az.proqramci.jpaminibook.beans.squence.Department;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Administrator
 */
public class PersistSamples {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAMiniBook");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Department department = null;

        entityManager.getTransaction().begin();
        for (int i = 1; i < 40; i++) {
            department = new Department();
            department.setName("IT"+i);
            entityManager.persist(department);
        }

        entityManager.getTransaction().commit();

    }
}
