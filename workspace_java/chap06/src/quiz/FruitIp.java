package quiz;

public class FruitIp {
	
	FruitA[] fru = new FruitA[2]; //FruitAŸ���� �迭 ����
	
	//������
	FruitIp(){
		
		i();
		
	}
	//������ �޼ҵ� �⺻��
	void i() {
		fru[0] = new FruitA();
		fru[0].name = "���";
		fru[0].price = 5000;
		fru[0].stock = 5;
	
		fru[1] = new FruitA();
		fru[1].name = "����";
		fru[1].price = 3000;
		fru[1].stock = 10;
	}
	
	/**
	 * ���ݹ��� �޼ҵ�
	 * ���� ���� : X
	 * ���� Ÿ�� : X(void)
	 * �׳� ���� ��� ���ݸ� ������ֱ�
	 * 
	 */
	
	
	void fruitSelect() {
		for(int i = 0; i < fru.length; i++) {
		System.out.println(fru[i].name+"�� ������ "+fru[i].price+"�� �Դϴ�!" );
		}
	}
	
	/**
	 * ���� 
	 * �Ž����� ����
	 * �������� String ����, int ����
	 * ���� Ÿ�� int
	 */
	
		int payment(String a , int b) {
			int pay = 0;
		for(int i = 0; i< fru.length; i++) {
			if(a.equals(fru[i].name)) {
				pay = fru[i].price;
			}
		}
		int result = pay*b;
		return result;
	}
	/**
	 * �Ž�����
	 * �������� String , int , int
	 * ����Ÿ��  int
	 * @return
	 */
		int totalpay(String a , int b, int c) {
			
			int pay = 0;
		for(int i = 0; i< fru.length; i++) {
			if(a.equals(fru[i].name)) {
				pay = fru[i].price;
			}
		}
			int result = c-pay*b;// �� �ݾ�
			if(c>=pay*b) {
				System.out.println("���� �ݾ� : "+c);
				System.out.println("�ܵ� : "+ result);
			}else {
				System.out.println("���� ���ڶ��ϴ�!");
			}
		return result;
	}
		
		/**
		 * ���� ���� �߰��ϱ�
		 * �������� String �����̸� int ���� �ݾ� int ���ϰ���
		 * ����Ÿ�� �迭
		 */
		
//		fru[] inFruit(String a, int b, int c){
			
		}
	
		
			
	
	
	

