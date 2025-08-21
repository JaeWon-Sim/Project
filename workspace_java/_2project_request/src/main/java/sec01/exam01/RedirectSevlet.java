package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectSevlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("redirect doGet ����");
		
		//��û�Ҷ� �ѱ� ���� ����
		request.setCharacterEncoding("utf-8");
		
		//�����Ҷ� �ѱ� ���� ����
		response.setContentType("text/html; charset=utf-8");
		
		String text = request.getParameter("text");
		System.out.println("text : "+text);
		
		response.sendRedirect("/_2project_request/another");//a�±� ���� ������ �ٲ���
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("redirect doPost ����");
		
		String text = request.getParameter("text");
		System.out.println("text : "+text);
		
		response.sendRedirect("/_2project_request/another");//a�±� ���� ������ �ٲ���
	}

}
