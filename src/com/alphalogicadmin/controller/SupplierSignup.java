package com.alphalogicadmin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alphalogicadmin.model.Supplier;
import com.alphalogicadmin.services.SupplierAuth;
import com.alphalogicadmin.services.SupplierInsert;


@WebServlet("/supplierSignup")
public class SupplierSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SupplierSignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd;
		
		Supplier sup=new Supplier();
		sup.setsFirstName(request.getParameter("sFirstName"));
		sup.setsLastName(request.getParameter("sLastName"));
		sup.setsEmail(request.getParameter("sEmail"));
		sup.setsPassword(request.getParameter("sRePassword"));
		sup.setsFirstName(request.getParameter("sFirstName"));
		sup.setsCompanyName(request.getParameter("sCompanyName"));
		
		if(SupplierInsert.isInserted(sup)){
			out.println("Inserted Wait for admin confirmation");
			rd=request.getRequestDispatcher("supplier.html");
			rd.include(request, response);
			
		}
		else{
			out.println("Already Present :::Login");
			rd=request.getRequestDispatcher("supplier.html");
			rd.include(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
