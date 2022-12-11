package com.nagarro.assignment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nagarro.assignment.model.Product;
import com.nagarro.assignment.sql.AddProduct;
import com.nagarro.assignment.sql.GetProduct;

public class AddProductForm extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(session.getAttribute("uname") == null) {
			resp.sendRedirect("login.jsp");
		}else {
			String title = req.getParameter("title");
			int quantity = Integer.parseInt(req.getParameter("quantity"));
			int size = Integer.parseInt(req.getParameter("size"));
			String image = req.getParameter("image");
			AddProduct.add(new Product(title, quantity, size, image));
			List<Product> l = GetProduct.get();
			session.setAttribute("products", l);
			req.getRequestDispatcher("products.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
