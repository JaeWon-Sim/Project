package sec05.exam05_final;

public class Person {

	final String nation = "KOREA";
	final String ssn;
	String name;
	
	//final
	//값이 할당된 경우 변경할 수 없게 막아줌
	//값을 변경할 수 없다
	Person(){
//		final의 값이 없던 경우 생성자에서 한번만 값 할당 가능!
		this.ssn = "주민번호";
		this.name = "이름";
//		this.nation = "다른나라";	이미 값이 할당된경우 변경 불가
		
		this.name = "이름2";
//		this.ssn = "주민번호2"; 
		
	}
	
	
	void test() {
//		this.ssn = "주민번호";
//		final이 붙으면 메소드에서 값 할당 불가!
		
	}
	
}
