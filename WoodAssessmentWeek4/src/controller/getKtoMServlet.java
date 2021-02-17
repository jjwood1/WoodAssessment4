package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
/**
 * Servlet implementation class getKtoMServlet
 */
@WebServlet("/getKtoMServlet")
public class getKtoMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getKtoMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserKtoM = request.getParameter("UserKtoM");
		KtoMConverter KtoMConvert = new KtoMConverter(Integer.parseInt(UserKtoM));
		request.setAttribute("KtoMValue", KtoMConvert);
		getServletContext().getRequestDispatcher("/KtoMResults.jsp").forward(request, response);
	}

}
