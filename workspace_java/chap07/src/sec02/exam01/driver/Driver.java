package sec02.exam01.driver;

public class Driver extends Car{
	
	void driveTico(Tico tico) {
		System.out.println("Ƽ��Ƽ��Ƽ��");
		tico.run();
		tico.autorun();
	}
	
	void drive(Car car) {
		System.out.println("�����������~");
		car.start();
		car.buckle();
		car.run();
		car.stop();
		if( car instanceof Tico) {
			System.out.println("�̰� ������ ��������?");
			Tico tico = (Tico) car;
			tico.autorun();
			
			((Tico) car).autorun();
		}
	}

}
