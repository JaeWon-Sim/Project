package sec01.exam01;

public class RemoteExam {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.turnOn();
		tv.setVolume(5);
		System.out.println(tv.vol);
		tv.setVolume(15);
		System.out.println(tv.vol);
		tv.setVolume(-5);
		System.out.println(tv.vol);
		
		RemoteControler rc2 = (RemoteControler)tv;
		RemoteControler rc1 = tv;
		powerOn(tv);
	}

	static void powerOn(RemoteControler rc) {
		rc.turnOn();
	}
}
