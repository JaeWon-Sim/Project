package updowngame;

import java.util.Scanner;

public class UpDown1 {
	int getNumber(int start, int end) {
		int result = Integer.MIN_VALUE;
		if(end>start) {
		result = (int)(Math.random()*(end-start+1))+start;
		}else {
		System.out.println("�������� ���߳���");
		}
		return result;
	}
		
	void start(int start, int end) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("����" +"%d ~ %d", start, end );
		
		System.out.println("1.���ӽ���      2.����");
		
		int number = s.nextInt();
		
		int menu = s.nextInt();
		
//		switch(menu) {
//			case1:
//			int result = getNumber(start, end);
//			boolean ok = false;
//			
//		
//			if(result == result) {
//				System.out.println("����");
//			} else if(result <number) {
//				System.out.println("�ѹ� up~ �ѹ� up~");
//			} else {
//				System.out.println("�ѹ� down~ �ѹ� down~");
//			}
//
//			break;
//		case0:
//			System.out.println("������");
//		}
//		
				
		
	}
	
	
}
