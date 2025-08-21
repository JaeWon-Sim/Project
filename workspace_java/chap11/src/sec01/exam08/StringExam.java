package sec01.exam08;

public class StringExam {

	public static void main(String[] args) {
		
		System.gc();//garbage collector 강제 호출
		
		String s1 = "영일이삼사오육칠팔구삼사";
		
//		char c = s1.charAt(100); StringIndexOutOfBoundsException 에러 발생
		char c = s1.charAt(0);
		System.out.println("char c : "+c);
		
		int i1 = s1.indexOf("삼사");
		System.out.println(i1);
		int i2 = s1.lastIndexOf("삼사");
		System.out.println(i2);
		int i3 = s1.indexOf("a");
		System.out.println(i3);	//없는 -1
		
		
//		이메일 양식 점검
//		@와 .이 하나 이상 있는가?
		String email = "kion2313@naver.com";
		
		int e1 = email.indexOf("@");
		int e2 = email.indexOf(".");
		
		
		if(e1 == -1 && e2 == -1) {
			System.out.println("NO.");
		}else if(e2-e1<0){
			System.out.println("NO.");
		}else{
			System.out.println(email+"사용가능");
		}
		
		int idx = -1;
		// indexOf 구현
		// email에 @가 몇번째 있는지 charAt
		for(int i = 0; i<email.length(); i++) {
			if((char)email.charAt(i)=='@') {
				idx = i;
				break;
			}
		}
		System.out.println(idx);
		
		String s2 = s1.replace("삼사", "34");
		System.out.println(s1);
		System.out.println(s2);
		// java의 replace는 모두 바꿔준다!
		
		//시작부터 끝 바로 앞까지
		String s3 = s1.substring(5,8);
		System.out.println(s3);
		
		//주민번호로 남자 여자 구분
		String ssn = "123456-1234567";
		
			if(ssn.substring(7,8).equals("1")) {
				System.out.println("남자");
			}else {
				System.out.println("여자");
			}
		String s5 = "   글씨     중간 공백    ";
		System.out.println("["+s5+"]");
		System.out.println("["+s5.trim()+"]");
		
		String menu = "김밥,라면,돈까스,참치김밥,제육볶음";
		String[] menus = menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "blog.naver.com";
		//split 정규 표현식을 사용(String 아님에 주의)
		//.은 정규 표현식에서 사용하는 예약어라서 문자.으로 인식불가
//		String [] urls = url.split("."); 
//		String [] urls = url.split("\\.");//예약어를 표현하는 방법:1
		String [] urls = url.split("[.]");//예약어를 표현하는 방법:2
		System.out.println(urls.length);
		
		String a = "a";
		a += "b";
		a = a+"c";
		
		//StringBuffer
		//메모리를 효율적으로 사용한다
		//StringBuilder보다 아주 약간 느림
		//스레드에 안전하다(Thread-safe)
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c");
		String d = sb.toString();
		
		StringBuilder sbb = new StringBuilder("a");
		sbb.append("b");
		String d2 = sbb.toString();
		
	}

}
