package com.servlet.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.servlet.DatabaseHandler.EmpDBHandler;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html;charset=UTF-8");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 processRequest (request, response);
	        
	            PrintWriter out = response.getWriter ();
	            String eid = request.getParameter ("id");
	            int id = Integer.parseInt (eid);
	            String ename = request.getParameter ("name");
	            String dept = request.getParameter ("dept");
	            try
	            {
	             
	             Connection con = EmpDBHandler.getConnection();
	             Statement stmt = con.createStatement ();
	             stmt.executeUpdate ("insert into emp values (" + id + ",'" + ename + "', '" + dept + "')");
	             out.println ("<h1>Record Inserted Successfully</h1>");
	             String sql = "select * from emp";
	             ResultSet rs = stmt.executeQuery (sql);
	             out.println ("<form action = 'ViewServlet' method='post'>");
	             out.print ("<tr><a href ='ViewServlet'>View Employee</a></td></tr>");
	             out.println ("</tr>");
	             out.println ("</table>");
	             out.println ("</form>");
	             rs.close ();
	             stmt.close ();
	             con.close ();
	            } 
	            catch (SQLException se)
	            {
	             throw new RuntimeException ("Cannot Connect the Database!", se);
	            }
	         
	       
	    
		
	}

}

