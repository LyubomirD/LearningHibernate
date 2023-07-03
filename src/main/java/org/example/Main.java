package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Employee employee = new Employee();
            employee.setEmployeeId(1);
            employee.setName("Bob Ross");
            employee.setJob("Painter");

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            System.out.println("Information saved ...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
