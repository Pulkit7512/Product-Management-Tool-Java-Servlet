package com.nagarro.assignment.sql;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.assignment.model.UserInfo;

public class ValidateUser {
	
	public static boolean checkDB(String userName, String password) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserInfo.class).buildSessionFactory();
		Session session  = factory.openSession();
		String q = "from userinfo where username='" + userName + "'AND userPassword='" + password + "'";
		Query query = session.createQuery(q);
		List<UserInfo> user = query.list();
		if(user.size() == 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
