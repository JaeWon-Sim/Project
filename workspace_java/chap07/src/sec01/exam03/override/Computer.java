package sec01.exam03.override;

public class Computer extends Calc {

	@Override // �θ� �ش� �޼ҵ尡 �Ȱ��� ����� �ִ��� Ȯ������
	public double areaCircle(double r) {
		System.out.println("Computer�� areaCircle");
		return r * r * Math.PI;
	}
	@Override
	public int plus(int x, int y) {
		int result = super.plus(x, y);
		System.out.println("Computer�� plus ����");
		System.out.println("������ �ٷ� "+(result)+"�Դϴ�");
		return result;
	}
	
}
