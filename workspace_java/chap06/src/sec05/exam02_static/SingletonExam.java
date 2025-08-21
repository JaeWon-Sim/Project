package sec05.exam02_static;

public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Singleton s= new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	
	}

}
