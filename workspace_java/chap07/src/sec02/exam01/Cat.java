package sec02.exam01;

public class Cat extends Animal {

	int age = 3;
	
	@Override
	void eat () {
		System.out.println("�ͱ��ͱ�");
	}
	
	@Override
	void think() {
		System.out.println("�𸣰ڴ�");
	}
	
	void clean() {
		System.out.println("�躯 ����");
	}
	
	void groomming() {
		System.out.println("����� ���� �մϴ�.");
	}
	
}
