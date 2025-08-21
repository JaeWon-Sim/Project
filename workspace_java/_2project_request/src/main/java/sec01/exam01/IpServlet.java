package sec01.exam01;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ip")
public class IpServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/ip doGet ����");
	
		//ip �ּҸ� �������� �� �߿� �ϳ�
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		
		// ���� method Ȯ��
		System.out.println("getMethod : "+ request.getMethod());
		
		// ���� �ּ� ��ü, �� queryString ����
		System.out.println("getRequestURL : "+ request.getRequestURL());
		
		// queryString�� ��������
		System.out.println("getQueryString : "+ request.getQueryString());
		
		//ip, port, querystring�� ������ �ּ�
		System.out.println("getRequestURI : "+ request.getRequestURI());
		
		//������Ʈ�� �����ϴ� �ּ�
		System.out.println("getContextPath" + request.getContextPath());
		
		//���� �ּҸ�
		System.out.println("getServletPath : "+ request.getServletPath());
	}
}
