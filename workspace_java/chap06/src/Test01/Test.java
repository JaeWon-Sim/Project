package Test01;

public class Test {
	Test1[] t = new Test1[4];
	//������
	Test(){
		
		init();
	
	}
	
	
	void init() {
		t[0] = new Test1();
		t[0].coffee = "���̽��Ƹ޸�ī��";
		t[0].price = 2000;
		
		t[1] = new Test1();
		t[1].coffee = "ī���";
		t[1].price = 3000;
		
		t[2] = new Test1();
		t[2].coffee = "����";
		t[2].price = 1500;
		
		t[3] = new Test1();
		t[3].coffee = "����";
		t[3].price = 2000;
	}
	/**
	 * �������� String Ŀ���̸�
	 * 
	 * @param a
	 * @return
	 */
	
	void order(String a) {
		for(int i = 0; i<t.length; i++) {
			if(i<=1 && 0<=i ) {
				System.out.println("�����������ϼ̽��ϴ�.");
				if(a.equals(t[i].coffee)) {
					System.out.println(a);
				}else {
					System.out.println("Ŀ�����������ϼ̽��ϴ�.");
					if(a.equals(t[i].coffee)) {
						System.out.println(a);
					}
				}
			}
		}
	}
	void menu() {
		for(int i = 0; i<t.length; i++) {
			System.out.println(t[i].coffee + t[i].price);
		}
	}
	
	
}
