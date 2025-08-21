package sec02.exam01;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("ㄱㄱㄱㄱ");
		for(int i = 0; i<args.length; i++) {
			System.out.println(i +":"+ args[i]);
		}

		int a = -1;
		try {
			String name = "jae won";
			a = Integer.parseInt(name);
			
			System.out.println( args[100] );
			System.out.println("1번자리");
		
//		}catch (Exception e){
//			System.out.println("4번자리");
//			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("2번자리");
			e.printStackTrace();
		
		} catch (NumberFormatException e) {
			System.out.println("3번자리");
			e.printStackTrace();
			System.out.println("-----------------------");
			System.out.println(e);
			System.out.println("-----------------------");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally 무조건 실행");
		}
		System.out.println("a :"+ a);
		System.out.println("출력");
	
	
		ExceptionExam e = new ExceptionExam();
		e.test();
	
	
	}
	public void test() {
		try {
			int a = 0;
			int b = 1;
			int c = b/a;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
