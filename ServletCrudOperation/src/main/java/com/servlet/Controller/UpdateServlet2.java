package com.servlet.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.DatabaseHandler.EmpDBHandler;
import com.servlet.model.Emp;

/**
 * Servlet implementation class UpdateServlet2
 */
public class UpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		 response.setContentType ("text/html");
	        PrintWriter out = response.getWriter ();
	        String sid = request.getParameter ("id");
	        int id = Integer.parseInt (sid);
	        String name = request.getParameter ("name");
	        String dept = request.getParameter ("dept");
	        Emp e = new Emp ();
	        e.setId (id);
	        e.setName (name);
	        e.setDept (dept);
	        int status = EmpDBHandler.update (e);
	        if (status > 0)
	        {
	         out.println ("Record updated succesfully...");
	         response.sendRedirect ("ViewServlet");
	        }
	        else
	        {
	         out.println ("Sorry! unable to update record");
	        }
	        out.close ();
		
		
	}

}
