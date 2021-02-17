package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MtoKConverter;


/**
 * Servlet implementation class getMtoKServlet
 */
@WebServlet("/getMtoKServlet")
public class getMtoKServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMtoKServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserMtoK = request.getParameter("UserMtoK");
		MtoKConverter MtoKConvert = new MtoKConverter(Integer.parseInt(UserMtoK));
		request.setAttribute("MtoKValue", MtoKConvert);
		getServletContext().getRequestDispatcher("/MtoKResults.jsp").forward(request, response);
	}

}
