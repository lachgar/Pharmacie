package controller;

import java.io.IOException;

import entities.Ville;
import entities.Zone;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import service.VilleService;
import service.ZoneService;

/**
 * Servlet implementation class ZoneController
 */
public class ZoneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VilleService vs;
	ZoneService zs;

    /**
     * Default constructor. 
     */
    public ZoneController() {
        // TODO Auto-generated constructor stub
    	vs = new VilleService();
    	zs = new ZoneService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String zone = request.getParameter("zoneName");
		int villeId = Integer.parseInt(request.getParameter("city"));
		Ville v = vs.findById(villeId);
		zs.create(new Zone(zone, v));
		response.sendRedirect("zones.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
