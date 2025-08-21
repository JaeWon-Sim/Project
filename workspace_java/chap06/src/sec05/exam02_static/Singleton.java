package sec05.exam02_static;

public class Singleton {
	
////	Singleton singleton = null;
//	private static Singleton singleton = null;
//	
//	private Singleton() {
//		
//	}
//	
////	Singleton getInstance() {
//	static Singleton getInstance() {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
//	class new가 한번만 되게끔 해주는 방패역할
//	구조적으로 한번만 생성하는 것을 보장한다!
//	디자인 패턴중 하나
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
