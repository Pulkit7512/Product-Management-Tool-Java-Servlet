package com.nagarro.assignment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nagarro.assignment.model.Product;
import com.nagarro.assignment.sql.DeleteProduct;
import com.nagarro.assignment.sql.GetProduct;

public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if(session.getAttribute("uname") == null) {
			resp.sendRedirect("login.jsp");
		}else {
			String title = req.getParameter("title");
			DeleteProduct.delete(title);
			List<Product> l = GetProduct.get(); 
			session.setAttribute("products", l);
			req.getRequestDispatcher("products.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
