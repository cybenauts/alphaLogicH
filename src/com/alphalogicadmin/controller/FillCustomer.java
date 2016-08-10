package com.alphalogicadmin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alphalogicadmin.services.FillJSONTable;


@WebServlet("/fillCustomer")
public class FillCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FillCustomer() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd;
		
		FillJSONTable ft=new FillJSONTable();
		out.println(ft.fillCustomer());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
