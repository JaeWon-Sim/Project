package sec02.exam01.driver;

public class Driver extends Car{
	
	void driveTico(Tico tico) {
		System.out.println("티코티코티코");
		tico.run();
		tico.autorun();
	}
	
	void drive(Car car) {
		System.out.println("ㄹㅆㄲ가즈아~");
		car.start();
		car.buckle();
		car.run();
		car.stop();
		if( car instanceof Tico) {
			System.out.println("이게 아직도 굴러가요?");
			Tico tico = (Tico) car;
			tico.autorun();
			
			((Tico) car).autorun();
		}
	}

}
