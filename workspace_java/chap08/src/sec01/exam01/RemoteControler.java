package sec01.exam01;

//new() 불가!
public interface RemoteControler {

	public static final int MAX_VOLUME = 10;
	// 모든 필드는 public static final(상수) 이다
	// 그래서 생략 가능하다!
	public int MIN_VOLUME = 0;
	
	
	public abstract void turnOn();
	//기본적으로 메소드는 abstract(추상) 메소드다
	//그래서 생략 가능하다
	public void turnOff();
	public void setVolume(int vol);
	
	
	//앞에 dafualt를 써서 선택해서 쓸 수 있음;
	default void mic(String text) {
		
	}
}
