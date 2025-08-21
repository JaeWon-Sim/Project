package emp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/remove")
public class EmpRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//Pseudo coding 슈도 코딩
		//말로 코딩
		//1.삭제 클릭
		
		
		//2.empno값 가져오기
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//3.값 세팅하기
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		//4.db실행문
		EmpService empService = new EmpService();
		int result = empService.removeEmp(empDTO);
		System.out.println(result +" 만큰 삭제 되었습니다.");
		
		
		//5.전체목록 페이지로 이동
		response.sendRedirect("list");
		
		
		
	
		
		
		
	}

}
