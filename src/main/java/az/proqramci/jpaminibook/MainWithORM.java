package az.proqramci.jpaminibook;

import az.proqramci.jpaminibook.beans.Car;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Proqramci
 */
public class MainWithORM {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAMiniBook");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        TypedQuery<Car> typedQuery = entityManager.createQuery("SELECT c FROM Car c", Car.class);
        List<Car> cars = typedQuery.getResultList();

        for (Car car : cars) {
            System.out.println("Car id: " + car.getId() + " Car Name: " + car.getName());
        }
        
        entityManager.close();
        entityManagerFactory.close();

    }
}
