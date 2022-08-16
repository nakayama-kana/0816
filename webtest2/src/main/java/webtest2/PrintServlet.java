package webtest2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintServlet
 */
@WebServlet("/PrintServlet")
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	/* public PrintServlet() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		String name = request.getParameter("name");
		out.println(name + "<br>");
		String seibetsu = request.getParameter("seibetsu");
		out.println(seibetsu + "<br>");
		String[] pleasure = request.getParameterValues("pleasure");
		if (pleasure != null) {
			for (int i = 0; i < pleasure.length; i++) {
				out.println(pleasure[i] + "<br>");

			}
		}
		String age = request.getParameter("age");
		out.println(age + "<br>");
		out.println("</body></html");
	}

}
