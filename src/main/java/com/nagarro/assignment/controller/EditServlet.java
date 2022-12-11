package com.nagarro.assignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if(session.getAttribute("uname") == null) {
			resp.sendRedirect("login.jsp");
		}else {
			String title = req.getParameter("title");
			int quantity = Integer.parseInt(req.getParameter("quantity"));
			int size = Integer.parseInt(req.getParameter("size"));
			String image = req.getParameter("image");
			session.setAttribute("title", title);
			session.setAttribute("quantity", quantity);
			session.setAttribute("size", size);
			session.setAttribute("image", image);
			req.getRequestDispatcher("edit.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
