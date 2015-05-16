package az.proqramci.jpaminibook;

import az.proqramci.jpaminibook.beans.Car;
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
        Connection connection = DriverManager.getConnection("url","username","password");//Baza ilə əlaqə 
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT id,name FROM Car");
        List<Car> cars = new ArrayList<Car>();
        while (rs.next()) {
            Car car = new Car();
            car.setId(rs.getInt("id"));
            car.setName(rs.getString("name"));
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println("Car id: " + car.getId() + " Car Name: " + car.getName());
        }
        connection.close();
    }
}
