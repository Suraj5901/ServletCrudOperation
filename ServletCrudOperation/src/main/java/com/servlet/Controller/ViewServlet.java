package com.servlet.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.servlet.DatabaseHandler.EmpDBHandler;
import com.servlet.model.Emp;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 response.setContentType ("text/html");
	        PrintWriter out = response.getWriter ();
	        out.println ("<a href='Index.html'>Add Employee</a>");
	        out.println ("<h1>Employees List</h1>");
	        List <Emp> list = EmpDBHandler.getAllEmployees();
	        out.print ("<table border='1' width='100%' ");
	        out.print("<tr><th>Id</th><th>Name</th><th>Dept</th><th>Update</th><th>Delete</th></tr>");
	        
	        for (Emp e:list)
	        {
	         out.print ("<tr><td>" + e.getId () + "</td><td>" + e.getName () +
	      "</td><td>" + e.getDept () +
	      "</td><td><a href='UpdateServlet?id=" + e.getId () +
	      "'>update</a></td>  <td><a href='DeleteServlet?id=" +
	      e.getId () + "'>delete</a></td></tr>");
	        }
	        out.print ("</table>");
	        out.close ();
	    
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
