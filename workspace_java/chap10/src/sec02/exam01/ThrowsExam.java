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
				System.out.println("������ 10 ���ϸ�");
			}
	
		}
		
		
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\temp\\text.txt");
			//some do
			//���ܰ� �߻��� �� �ִ�!
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
		//close() �ڵ���������! 
		//closeable �������̽��� �ִ� Ŭ������ ��ȣ �ȿ� ���� �� �ִ�
		try(
				// String a = "" //Closeable �������̽� ����!
				FileInputStream fis2 = new FileInputStream("c:\\temp\\text.txt");
			){
			System.out.println("������");
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
			
			"��".equals(null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
