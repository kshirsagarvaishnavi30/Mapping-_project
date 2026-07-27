package com.tka.client2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration(); 
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEname("Ram");
		Employee e2=new Employee();
		e2.setEname("John");
		Employee e3=new Employee();
		e3.setEname("Henrry");
		Employee e4=new Employee();
		e4.setEname("Jerry");
		
		List<Employee>all=new ArrayList<Employee>();
		
		all.add(e1);
		all.add(e2);
		all.add(e3);
		all.add(e4);
		
		Department dept=new Department();
		dept.setDept_name("IT");
		dept.setAllemp(all);
		
		session.save(dept);
		
		txn.commit();
		System.out.println("successfully added");
		session.close();

	}

}
