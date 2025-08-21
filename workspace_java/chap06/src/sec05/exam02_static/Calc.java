package sec05.exam02_static;

public class Calc {
	
	String color;	//필드
	
	static double pi = 3.1415923;//new를 선언하지 않아도 값을 가져옴
								 //static이긴 하지만 필드다!
//	price = 100;
	static {
		price = 100;//가능하다
		System.out.println("hi");
		//생성하자마자 실행된다
		//
	}
	static int price;
	Calc(){
		price = 10000;//생성자에서 초기화 가능!
	}
	
	
}
