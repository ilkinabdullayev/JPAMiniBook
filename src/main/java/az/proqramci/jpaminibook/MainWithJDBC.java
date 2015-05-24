package az.proqramci.jpaminibook;

import az.proqramci.jpaminibook.beans.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Proqramci
 */
public class MainWithJDBC {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("url", "username", "password");//Baza ilə əlaqə 
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT id,name,surname,age FROM Person");
        List<Person> persons = new ArrayList<Person>();
        while (rs.next()) {
            Person person = new Person();
            person.setPersonId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setSurname(rs.getString("surname"));
            person.setAge(rs.getInt("age"));
            persons.add(person);
        }
        
        for (Person person : persons) {
            System.out.println("Person name: " + person.getName() + " Person surname: " + person.getSurname() + " Person age: " + person.getAge());
        }
        connection.close();
    }
}
