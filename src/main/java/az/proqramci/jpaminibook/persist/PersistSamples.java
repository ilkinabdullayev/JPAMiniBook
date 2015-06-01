/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.persist;

import az.proqramci.jpaminibook.beans.squence.Department;
import az.proqramci.jpaminibook.beans.squence.Job;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrator
 */
public class PersistSamples {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAMiniBook");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Department department = null;
        Job job = null;
        entityManager.getTransaction().begin();
//        for (int i = 1; i < 40; i++) {
//            department = new Department();
//            department.setName("IT"+i);
//            entityManager.persist(department);
//        }
        department = new Department();
        department.setName("IT");
        entityManager.persist(department);

        job = new Job();
        job.setName("Software Developer");
        entityManager.persist(job);

        entityManager.getTransaction().commit();

    }
}
