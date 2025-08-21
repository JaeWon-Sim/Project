package sec06.exam02.pack3;

//import sec06.exam02.pack2.Human;
//import sec06.exam02.pack1.Human; 클래스명이 같으면 한번밖에 못쓴다!

import sec06.exam02.pack1.*;

public class HumanExam {

	public static void main(String[] args) {
		
//		new Human(); //pack2.human
//		//동일한 클래스명일때 불러오는 방법은 아래 참조!		
//		new sec06.exam02.pack1.Human();
//		sec06.exam02.pack1.Human h2 = new sec06.exam02.pack2.Human();
		
		new Human(); //pack1.human
//		하위 패키지의 클래스라서 안된다!
//		new Sub1();	//pack1.sub1.sub1
//		import java.lang.*는 자동 import가 되어서 생략 가능하다!
		String a = "1";
		System.out.println(a);
		Math.random();
		
	}

}
