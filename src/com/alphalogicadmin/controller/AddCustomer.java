package com.alphalogicadmin.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.alphalogicadmin.model.Customer;
import com.alphalogicadmin.model.CustomerPersonalInfo;
import com.alphalogicadmin.services.AddCustomerDB;

/**
 * Servlet implementation class AddCustomer
 */
@WebServlet("/addCustomer")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    private boolean isMultipart;
    private String filePath;
    private int maxFileSize = 500 * 1024;
    private int maxMemSize = 40 * 1024;
    private File file ;
    

    public void init( ){
       // Get the file location where it would be stored.
       filePath =  getServletContext().getInitParameter("file-upload"); 
       System.out.println(filePath);
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer cus=new Customer();
		String[][]hold;
		 // Check that we have a file upload request
	      isMultipart = ServletFileUpload.isMultipartContent(request);
	      response.setContentType("text/html");
	      java.io.PrintWriter out = response.getWriter( );
	      if( !isMultipart ){
	         out.println("<html>");
	         out.println("<head>");
	         out.println("<title>Servlet upload</title>");  
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<p>No file uploaded</p>"); 
	         out.println("</body>");
	         out.println("</html>");
	         return;
	      }
	      DiskFileItemFactory factory = new DiskFileItemFactory();
	      // maximum size that will be stored in memory
	      factory.setSizeThreshold(maxMemSize);
	      // Location to save data that is larger than maxMemSize.
	      factory.setRepository(new File("c:\\temp"));

	      // Create a new file upload handler
	      ServletFileUpload upload = new ServletFileUpload(factory);
	      // maximum file size to be uploaded.
	      upload.setSizeMax( maxFileSize );

	      try{ 
	      // Parse the request to get file items.
	      List fileItems = upload.parseRequest(request);
		
	      // Process the uploaded file items
	      Iterator i = fileItems.iterator();

	  
	      while ( i.hasNext () ) 
	      {
	         FileItem fi = (FileItem)i.next();
	         if ( !fi.isFormField () )	
	         {
	            // Get the uploaded file parameters
	            String fieldName = fi.getFieldName();
	            String fileName = "XXX"+".jpg";
	            String contentType = fi.getContentType();
	            boolean isInMemory = fi.isInMemory();
	            long sizeInBytes = fi.getSize();
	            // Write the file
	            if( fileName.lastIndexOf("\\") >= 0 ){
	               file = new File( filePath + 
	               fileName.substring( fileName.lastIndexOf("\\"))) ;
	            }else{
	               file = new File( filePath + 
	               fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	            }
	            
	            fi.write( file ) ;
	          //  out.println("Uploaded Filename: " + fileName + "<br>");
	         }else{
	        	 String fieldname = fi.getFieldName();
	                String fieldvalue = fi.getString();
	                System.out.println(fieldname+":::"+fieldvalue);
	                if(fieldname=="firstname"){
	                	cus.setcFirstName(fieldvalue);
	                }else if(fieldname=="lastname"){
	                	cus.setcLastName(fieldvalue);
	                }else if(fieldname=="email"){
	                	cus.setcEmail(fieldvalue);
	                }else if(fieldname==""){
	                	
	                }
	         }
	         
	      }
	      System.out.println("Image Uploaded");
	      out.print("Added");
	      RequestDispatcher rd=request.getRequestDispatcher("jsp/newCus.jsp");
	      rd.include(request, response);
	   }catch(Exception ex) {
	       System.out.println(ex);
	   }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		CustomerPersonalInfo cpi =new CustomerPersonalInfo();
		cpi.setcPhoneNo(request.getParameter("phone"));
		cpi.setcAddress1(request.getParameter("address1"));
		cpi.setcAddress2(request.getParameter("address2"));
		cpi.setcCity(request.getParameter("city"));
		cpi.setcPostalCode(request.getParameter("zip"));
		int cId=AddCustomerDB.isAdded(cus,cpi);
		System.out.println("CID in ADD Customer:::"+cId);
		//cus.setcImageUrl(String.valueOf(cId));
		if( cId != 0){
			HttpSession	session = request.getSession();//Session
			session.setAttribute("imageName", String.valueOf(cId));
			out.print(true);
			//out.println("<script>  </script>");
		}else{
			out.println(false);
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
