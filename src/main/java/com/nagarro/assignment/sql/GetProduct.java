package com.nagarro.assignment.sql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nagarro.assignment.model.Product;

public class GetProduct {

	public static List<Product> get() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		Session session  = factory.openSession();
		String q = "from product";
		Query query = session.createQuery(q);
		List<Product> products = query.list();
		return products;
	}

}
