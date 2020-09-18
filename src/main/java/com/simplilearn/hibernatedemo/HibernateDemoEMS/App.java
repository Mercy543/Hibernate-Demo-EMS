package com.simplilearn.hibernatedemo.HibernateDemoEMS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.simplilearn.hibernatedemo.HibernateDemoEMS.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //1. Load configuration
   StandardServiceRegistry sService = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
   
   Metadata meta = new MetadataSources(sService).getMetadataBuilder().build();
   
   //2 . Create Session factory
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    
    //3. Open Session
    
    Session session = factory.openSession();
    
    //4. Begin Transaction
    Transaction trans = session.beginTransaction();
    
    //5. Create an Employee Object
   
    Employee emp = new Employee();
   emp.setId(101);
   emp.setEmpName("Mary Smith");
   emp.setSalary(7543.76);
   emp.setDepartment("Sales");
   
   
   //6. save emp object
   session.save(emp);
   
   //7. commit transaction
   
   trans.commit();
   
   System.out.println("Employee Record is created !");
   
   
   factory.close();
   session.close();
    
    }
    
}
