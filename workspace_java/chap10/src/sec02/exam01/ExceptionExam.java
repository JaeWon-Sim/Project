package sec02.exam01;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("��������");
		for(int i = 0; i<args.length; i++) {
			System.out.println(i +":"+ args[i]);
		}

		int a = -1;
		try {
			String name = "jae won";
			a = Integer.parseInt(name);
			
			System.out.println( args[100] );
			System.out.println("1���ڸ�");
		
//		}catch (Exception e){
//			System.out.println("4���ڸ�");
//			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("2���ڸ�");
			e.printStackTrace();
		
		} catch (NumberFormatException e) {
			System.out.println("3���ڸ�");
			e.printStackTrace();
			System.out.println("-----------------------");
			System.out.println(e);
			System.out.println("-----------------------");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally ������ ����");
		}
		System.out.println("a :"+ a);
		System.out.println("���");
	
	
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
