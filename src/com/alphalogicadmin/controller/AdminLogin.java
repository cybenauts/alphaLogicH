package com.alphalogicadmin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alphalogicadmin.model.Admin;
import com.alphalogicadmin.services.AdminAuth;


@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AdminLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd;
		
		String aEmail=request.getParameter("username");
		String aPassword=request.getParameter("password");
		
		System.out.println(aEmail+":::"+aPassword);
		
		Admin ad=new Admin();
		ad.setaEmail(aEmail);
		ad.setaPassword(aPassword);
		
		if(AdminAuth.isAuth(ad)){
			rd=request.getRequestDispatcher("layout?i=dashboard");
			rd.forward(request, response);
		}
		else{
			out.println("INVALID");
			rd=request.getRequestDispatcher("admin.html");
			rd.include(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
