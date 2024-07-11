package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CourierForm")
public class CourierForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> list=(ArrayList<String>)request.getAttribute("errors");
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		if(list!=null) {
			Iterator <String> itr=list.iterator();
			out.println("<ul>");
			while(itr.hasNext()) {
				out.println("<li>"+itr.next()+"</li>");
			}
			out.println("</ul>");
		}
		out.println("<pre>");
	    out.println("<center><h1>Trust us to bring your world closer,one product at a time</h1></center>" );
	    out.println("<center><form action='CourierCont' method='post'>");
	    out.println("<h3>Username      <input type='text' name='username'> <br><br>");
	    out.println("Address1      <input type='text' name='address1'><br><br>");
	    out.println("Address2      <input type='text' name='address2'><br><br>");
	    out.println("Phone Number  <input type='text' name='phonenum'><br><br>");
	    out.println("Product       <input type='text'  name='product'><br><br>");
	    out.println("ProductNo     <input type='text' name='productno'><br><br>") ;
	    out.println("Quantity      <input type='text' name='quantity'><br><br>");
	    out.println("<input type='submit' value='submit'></center>");    
	    out.println("</form> </pre></h3> </body> <html>");
		
		
     }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
