package com.servlet.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.DatabaseHandler.EmpDBHandler;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
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
		

        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        String sid = request.getParameter ("id");
        int id = Integer.parseInt (sid);
        EmpDBHandler.delete (id);
        int status = EmpDBHandler.delete (id);
        if (status > 0)
        {
         out.print ("<p>Record deleted successfully!</p>");
         response.sendRedirect ("ViewServlet");
        }
        else
        {
         out.println ("Sorry! unable to delete record");
        }
        response.sendRedirect ("ViewServlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
