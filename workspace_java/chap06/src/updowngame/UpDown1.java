package updowngame;

import java.util.Scanner;

public class UpDown1 {
	int getNumber(int start, int end) {
		int result = Integer.MIN_VALUE;
		if(end>start) {
		result = (int)(Math.random()*(end-start+1))+start;
		}else {
		System.out.println("게임이해 못했나요");
		}
		return result;
	}
		
	void start(int start, int end) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("ㄱㄱ" +"%d ~ %d", start, end );
		
		System.out.println("1.게임시작      2.종료");
		
		int number = s.nextInt();
		
		int menu = s.nextInt();
		
//		switch(menu) {
//			case1:
//			int result = getNumber(start, end);
//			boolean ok = false;
//			
//		
//			if(result == result) {
//				System.out.println("ㅇㅇ");
//			} else if(result <number) {
//				System.out.println("넘버 up~ 넘버 up~");
//			} else {
//				System.out.println("넘버 down~ 넘버 down~");
//			}
//
//			break;
//		case0:
//			System.out.println("간다잉");
//		}
//		
				
		
	}
	
	
}
