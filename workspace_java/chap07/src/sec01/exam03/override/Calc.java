package sec01.exam03.override;

public class Calc {
	
	double areaCircle(double r) {
		System.out.println("Calc�� areaCircle");
		return r * r * Math.PI;
	}
		
	public int plus(int x, int y) {
		System.out.println("Calc�� plus ����");
		return x + y;
	}
	
}
