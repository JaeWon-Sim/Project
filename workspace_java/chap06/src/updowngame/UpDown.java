package updowngame;

public class UpDown {
	//up down game 
	
			UpDown(){
				System.out.println("즐거운 업다운게임");
			}
			int num;
			int count;

//	0~9까지의 랜덤한 숫자 받기
			void picknum() {
				this.num = (int)(Math.random()*10);
				return;
			}
			
			int selectnum(int num) {
				if(this.num!=num && this.num>num){
					this.count++;
					System.out.println("업"+count);
				}else if(this.num!=num && this.num<num) {
					this.count++;
					System.out.println("다운"+count);
				}else {
					System.out.println("게임 종료"+count+"번 시도");
					this.count++;
				}
				return 0;
	}
}


	

