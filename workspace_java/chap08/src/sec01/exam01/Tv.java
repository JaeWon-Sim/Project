package sec01.exam01;

public class Tv extends Display implements RemoteControler, OTT {
	
	int vol;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv�� Ų��");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv�� ����");
	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub
		if(vol > RemoteControler.MAX_VOLUME) this.vol=RemoteControler.MAX_VOLUME;
		else if(vol < RemoteControler.MIN_VOLUME) this.vol=RemoteControler.MIN_VOLUME;
			this.vol = vol;
	}

	@Override
	public void netflix() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

		
}
