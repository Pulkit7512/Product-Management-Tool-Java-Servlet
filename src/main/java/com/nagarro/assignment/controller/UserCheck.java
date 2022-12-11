package com.nagarro.assignment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nagarro.assignment.model.Product;
import com.nagarro.assignment.sql.GetProduct;
import com.nagarro.assignment.sql.ValidateUser;

public class UserCheck extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		resp.setContentType("text/html");
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(userName + " " + password);
		if(ValidateUser.checkDB(userName, password)) {
			List<Product> l = GetProduct.get();
			HttpSession session = req.getSession();
			session.setAttribute("uname", userName);
			session.setAttribute("products", l);
			req.getRequestDispatcher("products.jsp").forward(req, resp);
		} else {
			resp.getWriter().println("<html><body><h4>Invalid Details</h4></body></html>");
			req.getRequestDispatcher("login.jsp").include(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
