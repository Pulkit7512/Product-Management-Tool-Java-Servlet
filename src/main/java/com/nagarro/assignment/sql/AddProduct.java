package com.nagarro.assignment.sql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nagarro.assignment.model.Product;

public class AddProduct {
	public static void add(Product p) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		Session session  = factory.openSession();
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(p);
		t.commit();
	}
}
