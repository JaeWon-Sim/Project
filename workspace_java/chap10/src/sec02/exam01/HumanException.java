package sec02.exam01;

public class HumanException extends Exception {
	
	HumanException(){
		System.out.println("HumanException ����");
	}
	HumanException(String message){
		super(message);
		System.out.println("HumanException(String) ����");
	}
}
