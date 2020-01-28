package com.hibernate.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.hibernate.example.Employee;
import com.hibernate.example.Point;
import com.hibernate.example.Triangle;

public class StoreData {
public static void main(String[] args) {

//create standard service registry for configuring session factory to instantiate beans by the container
StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

//build meta data for the session factory that holds the beans
Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

//create session factory by calling method from meta object
SessionFactory factory = meta.getSessionFactoryBuilder().build();

//create a session by calling openSession() method from factory
Session session = factory.openSession();

//create transaction object to start transaction
Transaction t1 = session.beginTransaction();

//create an object in persistence layer
Employee e1 = new Employee();

//set the attribute values via application
e1.setId(8);
e1.setFirstName("Jack");
e1.setLastName("dorson");

//save the object to the database using persitance layer
session.save(e1);

//commit the transaction via transaction object
t1.commit();
//close the session - session state is maintained by hibernate
session.close();

System.out.println("Employee successfully saved");

session=factory.openSession();
Transaction t2 = session.beginTransaction();
 
 Point p1=new Point();
 p1.setX(5);p1.setY(5);
 
 Point p2=new Point();
 p2.setX(13);p2.setY(15);
 
 Point p3=new Point();
 p3.setX(12);p3.setY(17);
 
 Triangle triangle=new Triangle(p1,p2,p3);
 triangle.setId(3);
 triangle.setTname("T3");
 float area=triangle.calcArea();
 triangle.setTarea(area);  
 

 System.out.println("Area of triangle is:"+area);
 
 session.save(triangle);
 
 t2.commit();
 
 System.out.println("Triangle successfully saved");
 

factory.close();
session.close();

}
}