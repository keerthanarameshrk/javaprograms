package com.skills.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skills.modal.LoginModal;


@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		LoginModal login = new LoginModal();
		
		String name= login.getLogin(email,pwd);
		if(name ==null){
			response.sendRedirect("error.html");
		}else{
			response.sendRedirect("welcome.jsp");
		}
	}

}
