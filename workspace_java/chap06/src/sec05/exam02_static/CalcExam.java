package sec05.exam02_static;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calc.pi);//new가 안됬는데 출력 가능!
		
		
		Calc c = new Calc();
			c.color = "빨강";
		String a = c.color;
		System.out.println(a);
		c.pi=3.141592;
		System.out.println(c.pi);
		Calc c1 = new Calc();
		c1.color = "노랑";
		System.out.println(c1.pi);
		
		System.out.println(Math.PI);
		System.out.println(Calc.price);
		
		CalcExam p = new CalcExam();
		p.test();
//		test(); 스테이틱이 아니라 사용 불가!
		
	}
//	1. 메소드명 test 만들기
//	전달인자 / 리턴타입 없음
//	그냥 아무 말이나 출력
	
	void  test (){
		System.out.println("하하");
	}
	
	
}
