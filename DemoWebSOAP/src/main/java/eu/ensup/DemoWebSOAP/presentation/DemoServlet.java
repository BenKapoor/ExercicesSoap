package eu.ensup.DemoWebSOAP.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.HelloObjisWSService;
import client.IHelloObjis;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/index")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 instanciation du service (généré par wsimport)
		HelloObjisWSService monService = new HelloObjisWSService();
		
		// 2 récupération du client (généré par wsimport)
		IHelloObjis port = monService.getHelloObjisWSPort();
		
		// 3 appel d'une opération service
		String resultat = port.ditBonjour("Objis");
		
		if (! resultat.isEmpty()) {
			System.out.println("resultat: "+ resultat);
			
			request.setAttribute("resultat", resultat);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request,response);
		} else {
			System.out.println("erreur");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
