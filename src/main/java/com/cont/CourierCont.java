package com.cont;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Courier;
import com.model.CourierDao;

/**
 * Servlet implementation class CourierCont
 */
@WebServlet("/CourierCont")
public class CourierCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username").trim();
		String address1=request.getParameter("address1").trim();
		String address2=request.getParameter("address2").trim();
		String phonenum =request.getParameter("phonenum").trim();
		String product=request.getParameter("product").trim();
		String productno=request.getParameter("productno").trim();
		String quantity =request.getParameter("quantity").trim();
		ArrayList<String> list=new ArrayList<String>();
		if(!list.isEmpty()) {
			request.setAttribute("errors", list);
			RequestDispatcher rd=request.getRequestDispatcher("AddMatchForm");
			rd.forward(request, response);
		//	return ;
		}
		
		Courier m = new Courier(username,address1,address2,phonenum,product,productno,quantity);
		CourierDao md=new CourierDao();
		md.storeData(m);
		RequestDispatcher rd1=request.getRequestDispatcher("Acknowledgement.html");
		rd1.forward(request, response);
		
	}

}
