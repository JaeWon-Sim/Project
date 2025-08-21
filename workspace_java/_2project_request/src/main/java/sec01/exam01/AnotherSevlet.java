package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/another")
public class AnotherSevlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AnotherSevlet doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("another.text : " + text);
		response.getWriter().println("AnotherSevlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AnotherSevlet doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("another.text : " + text);
		response.getWriter().println("AnotherSevlet post");
		
	}

}
