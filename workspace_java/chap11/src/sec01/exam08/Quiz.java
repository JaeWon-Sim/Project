package sec01.exam08;

public class Quiz {

	public static void main(String[] args) {

				//문제 1.
				//blog.naver.co.kr에서 naver만 추출하기
		String nb = "blog.naver.co.kr";
		int firstdot = nb.indexOf(".");
//		System.out.println(firstdot);
		String nb1 = nb.substring(firstdot+1);
//		System.out.println(nb1);
		int seconddot = nb1.indexOf(".");
//		System.out.println(seconddot);
		String nb3 = nb1.substring(0,seconddot);
//		System.out.println(nb3);
				//문제 2.
				//"Hello world"
				//"ello world H"
				//"llo world He"
				// 전광판 효과처럼 Hello world index값 바꿔주기
		String hw = "Hello world";
		for(int i = 0; i<hw.length(); i++) {
			String h = hw.substring(i) + hw.substring(0, i);
			System.out.println(h);
		}
				//문제 3.
				//humanec@naver.com 이걸
				//hu****@naver.com 로 변경
				//love@naver.com 도 마찬가지로!
		String email = "love@naver.com";
		String two = email.substring(0,2);
		System.out.println(two);
		int gbi = email.indexOf("@");
		String aftwo = email.substring(gbi);
		System.out.println(aftwo);
		String totalEmail = two+"**"+aftwo;
		System.out.println(totalEmail);
		
		
		
				//문제 4.
				//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=sim&ackey=3b8e6axt
				//키 query의 값이 검색어 검색어만 출력
		String search = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=sim&ackey=3b8e6axt";
		int query = search.indexOf("query");
		System.out.println(query);
		System.out.println(search.substring(query));
		
		
	}

}
