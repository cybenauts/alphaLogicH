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


/**
 * Servlet implementation class SupplierLogin
 */
@WebServlet("/supplierLogin")
public class SupplierLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd;
		
		String sEmail=request.getParameter("username");
		String sPassword=request.getParameter("password");
		
		System.out.println(sEmail+":::"+sPassword);
		
		Supplier sup=new Supplier();
		sup.setsEmail(sEmail);
		sup.setsPassword(sPassword);
			
		int authStatus=SupplierAuth.isAuth(sup);
		if(authStatus==1){
			rd=request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
		}else if(authStatus==0){
			out.println("Waiting for admin approval");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}else if(authStatus==2){
			out.println("Deactivated User");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}else if(authStatus==3){
			out.println("Email/Password is invalid");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		else{
			out.println("INVALID Credentials ::Please Signup");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
