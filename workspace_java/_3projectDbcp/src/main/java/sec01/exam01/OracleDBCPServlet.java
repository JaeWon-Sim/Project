package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbcp")
public class OracleDBCPServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			// JNDI ������� context.xml�� �ִ� DB������ �����´�
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle");
			
			Connection conn = dataFactory.getConnection();
			
			// SQL �غ�
			String query = "select * from emp";
			PreparedStatement ps = conn.prepareStatement(query);
						
			// SQL ���� �� ��� Ȯ��
			ResultSet rs = ps.executeQuery();
						
			PrintWriter out = response.getWriter();
					
			// �������ڷ� �÷���(��ҹ��� ���� X)
			while( rs.next() ) {
				int empno = rs.getInt("empno");
				System.out.print(empno + ",");
				out.println(empno + ",");
				
				Date hiredate = rs.getDate("hiredate");
				out.println(hiredate.toLocalDate());
				
				String ename = rs.getString("ename");
				System.out.println(ename);
				out.println(ename);
			}
					
			ps.close();
			rs.close();
			conn.close(); // Ŀ�ؼ� Ǯ�� ��ȯ
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	


}
