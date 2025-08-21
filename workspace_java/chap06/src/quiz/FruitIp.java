package quiz;

public class FruitIp {
	
	FruitA[] fru = new FruitA[2]; //FruitA타입의 배열 생성
	
	//생성자
	FruitIp(){
		
		i();
		
	}
	//생성자 메소드 기본값
	void i() {
		fru[0] = new FruitA();
		fru[0].name = "사과";
		fru[0].price = 5000;
		fru[0].stock = 5;
	
		fru[1] = new FruitA();
		fru[1].name = "딸기";
		fru[1].price = 3000;
		fru[1].stock = 10;
	}
	
	/**
	 * 가격문의 메소드
	 * 전달 인자 : X
	 * 리턴 타입 : X(void)
	 * 그냥 과일 명과 가격만 출력해주기
	 * 
	 */
	
	
	void fruitSelect() {
		for(int i = 0; i < fru.length; i++) {
		System.out.println(fru[i].name+"의 가격은 "+fru[i].price+"원 입니다!" );
		}
	}
	
	/**
	 * 가격 
	 * 거스름돈 결제
	 * 전달인자 String 과일, int 갯수
	 * 리턴 타입 int
	 */
	
		int payment(String a , int b) {
			int pay = 0;
		for(int i = 0; i< fru.length; i++) {
			if(a.equals(fru[i].name)) {
				pay = fru[i].price;
			}
		}
		int result = pay*b;
		return result;
	}
	/**
	 * 거스름돈
	 * 전달인자 String , int , int
	 * 리턴타입  int
	 * @return
	 */
		int totalpay(String a , int b, int c) {
			
			int pay = 0;
		for(int i = 0; i< fru.length; i++) {
			if(a.equals(fru[i].name)) {
				pay = fru[i].price;
			}
		}
			int result = c-pay*b;// 총 금액
			if(c>=pay*b) {
				System.out.println("받은 금액 : "+c);
				System.out.println("잔돈 : "+ result);
			}else {
				System.out.println("돈이 모자랍니다!");
			}
		return result;
	}
		
		/**
		 * 과일 새로 추가하기
		 * 전달인자 String 과일이름 int 과일 금액 int 과일개수
		 * 리턴타입 배열
		 */
		
//		fru[] inFruit(String a, int b, int c){
			
		}
	
		
			
	
	
	

