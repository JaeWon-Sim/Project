package sec05.exam02_static;

public class Calc {
	
	String color;	//�ʵ�
	
	static double pi = 3.1415923;//new�� �������� �ʾƵ� ���� ������
								 //static�̱� ������ �ʵ��!
//	price = 100;
	static {
		price = 100;//�����ϴ�
		System.out.println("hi");
		//�������ڸ��� ����ȴ�
		//
	}
	static int price;
	Calc(){
		price = 10000;//�����ڿ��� �ʱ�ȭ ����!
	}
	
	
}
