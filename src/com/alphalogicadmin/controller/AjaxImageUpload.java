package com.alphalogicadmin.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import org.apache.commons.io.IOUtils; //external jar
/**
 * Servlet implementation class ImageUpload
 */
@WebServlet("/imageUpload")
public class AjaxImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String DESTINATION_DIR_PATH = "/WEB-INF/uploads"; //change it to get the correct path
    private static String realPath;
       
  
    public AjaxImageUpload() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        realPath = getServletContext().getRealPath(DESTINATION_DIR_PATH) + "/";
        System.out.println(realPath);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   PrintWriter writer = null;
	        InputStream is = null;
	        FileOutputStream fos = null;

	        try {
	            writer = response.getWriter();
	        } catch (IOException ex) {
	            System.out.println(AjaxImageUpload.class.getName() + ":::has thrown an exception: " + ex.getMessage());
	        }

	        String filename = request.getHeader("X-File-Name");
	        try {
	            is = request.getInputStream();
	            fos = new FileOutputStream(new File(realPath + filename));
	            IOUtils.copy(is, fos);
	            response.setStatus(response.SC_OK);
	            writer.print("{success: true}");
	        } catch (FileNotFoundException ex) {
	            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
	            writer.print("{success: false}");
	            System.out.println(AjaxImageUpload.class.getName() + "has thrown an exception: " + ex.getMessage());
	        } catch (IOException ex) {
	            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
	            writer.print("{success: false}");
	            System.out.println(AjaxImageUpload.class.getName() + "has thrown an exception: " + ex.getMessage());
	        } finally {
	            try {
	                fos.close();
	                is.close();
	            } catch (IOException ignored) {
	            }
	        }

	        writer.flush();
	        writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
