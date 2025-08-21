package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) {
		
		try {
			test();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test2(50);
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			String errorCode = e.getMessage();
			if(errorCode.equals("EV10")) {
				System.out.println("볼륨은 10 이하만");
			}
	
		}
		
		
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\temp\\text.txt");
			//some do
			//예외가 발생할 수 있다!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) {
				
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		//try-with-resources
		//close() 자동실행해줌! 
		//closeable 인터페이스가 있는 클래스만 괄호 안에 넣을 수 있다
		try(
				// String a = "" //Closeable 인터페이스 없음!
				FileInputStream fis2 = new FileInputStream("c:\\temp\\text.txt");
			){
			System.out.println("뭔가함");
			System.out.println(fis2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		test3();
		
		
	}
	static void test() throws ClassNotFoundException, IOException {
		Class.forName("fffffffffffa");
	}
	
	static void test2(int vol) throws HumanException {
		
		if(vol>10) {
			throw new HumanException("EV10");
		}else if(vol < 0) {
			throw new HumanException("EV0");
		}
		System.out.println("vol : "+ vol);
	}
	static void test3() {
		try { 
			
			"ㅁ".equals(null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
