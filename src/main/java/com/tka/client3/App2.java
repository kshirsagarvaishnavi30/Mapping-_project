package com.tka.client3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.client2.Department;
import com.tka.client2.Employee;

public class App2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration(); 
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		
		
		Department2 dept = new Department2(101, "IT");

        Employee2 e1 = new Employee2(1, "Tom", 50000, dept);
        Employee2 e2 = new Employee2(2, "John", 60000, dept);
        Employee2 e3 = new Employee2(3, "Ram", 45000, dept);

        session.persist(dept);
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        txn.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Data Inserted Successfully");

	}

}
