package controller;

import java.io.IOException;

import entities.Ville;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.VilleService;

/**
 * Servlet implementation class VilleController
 */
public class VilleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private VilleService vs;

	/**
	 * Default constructor.
	 */
	public VilleController() {
		// TODO Auto-generated constructor stub
		vs = new VilleService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("op") != null) {
			if (request.getParameter("op").equals("delete")) {
				int id = Integer.parseInt(request.getParameter("id"));
				vs.delete(vs.findById(id));
				response.sendRedirect("villes.jsp");
			}
			if (request.getParameter("op").equals("update")) {
				Ville v = vs.findById(Integer.parseInt(request.getParameter("id")));
				response.sendRedirect("villes.jsp?id=" + v.getId() + "&nom=" + v.getNom());
			}

		} else if (!request.getParameter("id").equals("")) {
			Ville v = vs.findById(Integer.parseInt(request.getParameter("id")));
			String nom = request.getParameter("nom");
			v.setNom(nom);
			vs.update(v);
			response.sendRedirect("villes.jsp");
			
		}else  {
			String nom = request.getParameter("nom");
			vs.create(new Ville(nom));
			response.sendRedirect("villes.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
