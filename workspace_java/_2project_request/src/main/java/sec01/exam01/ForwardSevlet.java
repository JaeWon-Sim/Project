package sec01.exam01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward")
public class ForwardSevlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		response.getWriter().println("ForwardSevlet");
		
		// another에서 get으로 전달됨
		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		response.getWriter().println("ForwardSevlet");
		
		// another에서 get으로 전달됨
		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
		dispatcher.forward(request, response);
	}

}
