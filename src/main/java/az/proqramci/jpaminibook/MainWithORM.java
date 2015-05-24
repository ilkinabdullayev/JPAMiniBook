package az.proqramci.jpaminibook;

import az.proqramci.jpaminibook.beans.Person;
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

        TypedQuery<Person> typedQuery = entityManager.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> cars = typedQuery.getResultList();

        for (Person person : cars) {
            System.out.println("Person name: " + person.getName() + " Person surname: " + person.getSurname()+ " Person age: " + person.getAge());
        }
        
        entityManager.close();
        entityManagerFactory.close();

    }
}
