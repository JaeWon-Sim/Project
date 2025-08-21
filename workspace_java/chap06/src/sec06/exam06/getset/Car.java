package sec06.exam06.getset;

public class Car {
	
	//필드는 private로 지정해서 직접 읽고 쓰는걸 방지
	private int speed;
	private boolean stop;
	
	private String color;
	private double gas;


	//이렇게 맘대로 만들어도 되는데 
	public int test() {
		return this.speed;
	}
	
	
	//getter
	//보통 필드 값을 돌려주는 기능
	//메소드명 : get+ 필드명(대문자로 시작)
	//전달인자 :없음
	//리턴타임 : 필드의 타입
	public int getSpeed() {
		return this.speed;
	}
	
	//setter
	// 보통 필드 값을 수정하는 기능
	// 메소드명 : set + 필드명(대문자)
	// 전달인자 : 필드의 타입
	// 리턴 타입은 없음 (void)
	void setSpeed(int speed) {
		if(speed >=0) {
			this.speed = speed;
		}
	}
	
	//getter 중에서 boolean타입일 경우
	//get 대신 is를 쓰기도 한다
	//getStop, isStop 둘 다 허용인데
	//일부에서는 get만 사용 가능한 경우가 있다
	public boolean isStop() {
		return this.stop;
	}
	public boolean getStop() {//가장 확실한 get/set!!
		return this.stop;
	}
	public boolean setStop(boolean stop) {
		return this.stop = stop;
	}
	//자동 완성된 getter/setter
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public double getGas() {
		return gas;
	}
	
	
	public void setGas(double gas) {
		this.gas = gas;
	}
	
	
	
	
	
	
	
	
}
