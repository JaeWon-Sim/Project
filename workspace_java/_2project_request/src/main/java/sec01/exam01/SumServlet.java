package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss")
public class SumServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("num1"));
		System.out.println(request.getParameter("num2"));
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int sum = a+b;
		
		PrintWriter out = response.getWriter();
    	out.println("<h1>");
    	out.println("NUM1 : "+a);
    	out.println("<br>");
    	out.println("NUM2 : "+b);
    	out.println("<br>");
    	out.print("SUM : "+sum);
    	out.println("</h1>");
		
		System.out.println(sum);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
