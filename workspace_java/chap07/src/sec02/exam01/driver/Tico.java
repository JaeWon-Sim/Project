package sec02.exam01.driver;

public class Tico extends Car {
	
	
	@Override
	void run() {
		System.out.println("티코 ㄹㅅㄱ");
	}
	
	void autorun() {
		System.out.println("자율주행 ㄹㅆㄲ");
	}
}
