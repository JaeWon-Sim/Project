package sec02.exam01;

public class ParentExam {

	public static void main(String[] args) {
		Parent1_1_1 p1_1_1 = new Parent1_1_1();
		Parent1_1 p1_1 = (Parent1_1)p1_1_1;
		p1_1 = p1_1_1;
		
		Parent1 p1 = p1_1;
		p1 = p1_1_1;
		
		Parent1 pp1 = new Parent1_1_1();
////////////////////////////////////////////////////////////
		Parent1_2 p1_2 = new Parent1_2();
		Parent1 ppp1 = p1_2;

		//�θ� �ڽ��� �ɶ��� ����ȯ ������ ���� �Ұ���
		Parent1_2 pp1_2 = (Parent1_2)ppp1;
		
		//��Ÿ�ӿ��� �����غ��� �ƴ°�!
		Parent1_2 ppp1_2 = (Parent1_2)pp1;
	}

}
