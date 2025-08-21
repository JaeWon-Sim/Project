package sec06.exam02.pack3;

import sec06.exam02.pack2.Access2;

public class AccessExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Access1(); 생성자가 public이 아니라서 안됨 ㅠㅜ
	
		Access2 a = new Access2();
//		a.test1(); public 아님
		a.test2(); //public 있음
	
	}

}
