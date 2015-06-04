/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.proqramci.jpaminibook.connectiontype;

import az.proqramci.jpaminibook.persist.PersistSamples;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ilkin Abdullayev
 */
public class DBConnect {

    // @PersistenceContext(name = "JPAMiniBook")//OnlyEE    
    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public DBConnect() {
        entityManagerFactory = Persistence.createEntityManagerFactory("JPAMiniBook");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void run() {
        PersistSamples persistSamples = new PersistSamples(entityManager);
      //  persistSamples.persistMethodSixth();
    }

    public static void main(String[] args) {
        new DBConnect().run();
    }
}
