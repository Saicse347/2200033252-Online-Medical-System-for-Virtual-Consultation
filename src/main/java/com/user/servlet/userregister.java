package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DB.DBconnect;
import com.dao.userDAO;
import com.entity.user;

@WebServlet("/user_register")
public class userregister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try
		{
			String fullname=req.getParameter("fullname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			user u=new user(fullname, email, password);
			userDAO dao=new userDAO(DBconnect.getcon());
			
			boolean f=dao.register(u);
			
			if(f) {
				System.out.println("Registered succesfull");
			}else {
				System.out.println("Something wrong on server");	
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
