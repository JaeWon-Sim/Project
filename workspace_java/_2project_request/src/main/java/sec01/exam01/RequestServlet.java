package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet ����");
		
		
		//��û�Ҷ� �ѱ� ���� ����
		request.setCharacterEncoding("utf-8");
				
		//�����Ҷ� �ѱ� ���� ����
		response.setContentType("text/html; charset=utf-8");
		
		
		
		//getParameter
		//���޹��� �Ķ������ key�� ��� �޾ƿ���
		//������ null
		String num1 = request.getParameter("num1");
		System.out.println("num1="+num1);
		System.out.println(request.getRemoteAddr());
		
		
		//������ null
        System.out.println("pw: "+ request.getParameter("pw"));
		
        //������ null
        System.out.println("check: "+ request.getParameter("check"));
        
        
        String [] checks = request.getParameterValues("check");
        System.out.println(checks);
        if(checks != null) {
        	for(String chk : checks) {
        		System.out.println(chk);
        	}
        }
        
        System.out.println("hidden1 : "+request.getParameter("hidden1"));
        
        //button�� ������ �ȵȴ�!
        System.out.println("btn1 : "+request.getParameter("btn1"));
        System.out.println("btn2 : "+request.getParameter("btn2"));
        
        // ������ null
        System.out.println("radio1 : "+request.getParameter("radio1"));
        
        System.out.println("date1 : "+request.getParameter("date1"));
        System.out.println("number1 : "+request.getParameter("number1"));
        System.out.println("div1 : "+request.getParameter("div1"));
        System.out.println("select1 : "+request.getParameter("select1"));
        System.out.println("textarea1 : "+request.getParameter("textarea1"));
        
        response.getWriter().println("{\"k\":123}");
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doPost ����");
		
		response.getWriter().println("{\"k\":123}");
		System.out.println("num1 :"+request.getParameter("num1"));
	}

}
