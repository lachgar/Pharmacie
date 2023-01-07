package controller;

import java.io.IOException;

import entities.Pharmacien;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UserService;
import util.Utils;
/**
 * Servlet implementation class PharmacienController
 */
public class PharmacienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us;

    /**
     * Default constructor. 
     */
    public PharmacienController() {
        // TODO Auto-generated constructor stub
    	us = new UserService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("lastName");
		String prenom = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String telephone = request.getParameter("telephone");
		if(us.create(new Pharmacien(email, Utils.MD5(password), 0, nom, prenom, telephone)))
			response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
