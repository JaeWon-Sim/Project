package Test01;

public class Test {
	Test1[] t = new Test1[4];
	//생산자
	Test(){
		
		init();
	
	}
	
	
	void init() {
		t[0] = new Test1();
		t[0].coffee = "아이스아메리카노";
		t[0].price = 2000;
		
		t[1] = new Test1();
		t[1].coffee = "카페라때";
		t[1].price = 3000;
		
		t[2] = new Test1();
		t[2].coffee = "녹차";
		t[2].price = 1500;
		
		t[3] = new Test1();
		t[3].coffee = "말차";
		t[3].price = 2000;
	}
	/**
	 * 전달인자 String 커피이름
	 * 
	 * @param a
	 * @return
	 */
	
	void order(String a) {
		for(int i = 0; i<t.length; i++) {
			if(i<=1 && 0<=i ) {
				System.out.println("차종류선택하셨습니다.");
				if(a.equals(t[i].coffee)) {
					System.out.println(a);
				}else {
					System.out.println("커피종류선택하셨습니다.");
					if(a.equals(t[i].coffee)) {
						System.out.println(a);
					}
				}
			}
		}
	}
	void menu() {
		for(int i = 0; i<t.length; i++) {
			System.out.println(t[i].coffee + t[i].price);
		}
	}
	
	
}
