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
 * Servlet implementation class Reportservlet
 */
<<<<<<< HEAD
=======

@WebServlet("/ReportServlet")
>>>>>>> bc6f1f5 (Servlet Crud Operation completed)
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ReportServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		response.getWriter().append("Served at: ").append(request.getContextPath());
=======
//		response.getWriter().append("Served at: ").append(request.getContextPath());
>>>>>>> bc6f1f5 (Servlet Crud Operation completed)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		doGet(request, response);
=======
//		doGet(request, response);
>>>>>>> bc6f1f5 (Servlet Crud Operation completed)
		
		 response.setContentType ("text/html");
	        PrintWriter out = response.getWriter ();
	        String name = request.getParameter ("name");
	        String dept = request.getParameter ("dept");
	        Emp e = new Emp ();
	        e.setName (name);
	        e.setDept (dept);
	        int status = EmpDBHandler.save (e);
	        if (status > 0)
	        {
	         out.print ("<p>Record saved successfully!</p>");
<<<<<<< HEAD
	         request.getRequestDispatcher ("index.html").include (request, response);
=======
	         request.getRequestDispatcher ("Index.html").include (request, response);
>>>>>>> bc6f1f5 (Servlet Crud Operation completed)
	        }
	        else
	        {
	         out.println ("Sorry! unable to save record");
	        }
	        out.close ();
	    }
		
		
	

}
