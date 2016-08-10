package com.alphalogicadmin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Layout
 */
@WebServlet("/layout")
public class Layout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Layout() {
        super();
    }
    

	//String options[]={"dashboard","customer","pCategory","pProduct","order","gShipping","gReviews","gInventory","gEvents","content","rCustomer"};
	String customer[]={"Customer"};
	String product[]={"Category","Product"};
	String order[]={"Order"};
	String general[]={"Shipping","Reviews","Inventory","Events"};
	String content[]={"Content"};
	String report[]={"Customer","Payment","Sales","Inventory"};	
	RequestDispatcher rd;
	PrintWriter out;
	String i;
	String sh;
	String rem;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	out=response.getWriter();
		response.setContentType("text/html");
		
		i=request.getParameter("i");
		sh=i.substring(0, 1);
		rem=i.substring(1);
		
		switch(sh){
		 case "c":
			setSection(customer, request, response);
			 break;
		case "p":
			 setSection(product, request, response);
			 break;
		case "o":
			 setSection(order, request, response);
			 break;
		case "g":
			 setSection(general, request, response);
			 break;
		case "m":
			 setSection(content, request, response);
			 break;
		case "r":
			 setSection(report, request, response);
			 break;
		default:
			//out.println("dashCon.jsp");
			rd=request.getRequestDispatcher("jsp/dashCon.jsp");
			rd.include(request, response);
			 
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void setSection(String []trav,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 for (int j = 0; j < trav.length; j++) {
				if(rem.equals(trav[j])){
					//out.println((trav[j]+".jsp").toLowerCase());
					rd=request.getRequestDispatcher(("jsp/"+trav[j]+".jsp").toLowerCase());
					rd.include(request, response);
				}
			}
	}

}
