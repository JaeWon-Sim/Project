package updowngame;

public class UpDown {
	//up down game 
	
			UpDown(){
				System.out.println("��ſ� ���ٿ����");
			}
			int num;
			int count;

//	0~9������ ������ ���� �ޱ�
			void picknum() {
				this.num = (int)(Math.random()*10);
				return;
			}
			
			int selectnum(int num) {
				if(this.num!=num && this.num>num){
					this.count++;
					System.out.println("��"+count);
				}else if(this.num!=num && this.num<num) {
					this.count++;
					System.out.println("�ٿ�"+count);
				}else {
					System.out.println("���� ����"+count+"�� �õ�");
					this.count++;
				}
				return 0;
	}
}


	

