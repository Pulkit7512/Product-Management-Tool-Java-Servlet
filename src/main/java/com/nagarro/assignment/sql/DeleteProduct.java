package com.nagarro.assignment.sql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nagarro.assignment.model.Product;

public class DeleteProduct {
	public static void delete(String title) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		Session session  = factory.openSession();
		String q = "delete from product where title ='" + title+ "'";
		Transaction t = session.beginTransaction();
		Query query = session.createQuery(q);
		query.executeUpdate();
		t.commit();
	}
}
