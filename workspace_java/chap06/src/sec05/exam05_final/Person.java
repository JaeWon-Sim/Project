package sec05.exam05_final;

public class Person {

	final String nation = "KOREA";
	final String ssn;
	String name;
	
	//final
	//���� �Ҵ�� ��� ������ �� ���� ������
	//���� ������ �� ����
	Person(){
//		final�� ���� ���� ��� �����ڿ��� �ѹ��� �� �Ҵ� ����!
		this.ssn = "�ֹι�ȣ";
		this.name = "�̸�";
//		this.nation = "�ٸ�����";	�̹� ���� �Ҵ�Ȱ�� ���� �Ұ�
		
		this.name = "�̸�2";
//		this.ssn = "�ֹι�ȣ2"; 
		
	}
	
	
	void test() {
//		this.ssn = "�ֹι�ȣ";
//		final�� ������ �޼ҵ忡�� �� �Ҵ� �Ұ�!
		
	}
	
}
