package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		//add 추가
		list.add(123);
		list.add("글씨");
		
		//중간에 삽입
		list.add(1, "삽입");
		System.out.println(list);
		
		System.out.println(list.contains(123));
		System.out.println(list.get(1));//object에 toString이 무조건 실행이 되서 가능
		
		String a = (String)list.get(1);
		String b = list.get(1).toString();
		
		list.remove(1);
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list = new ArrayList();
		
		System.out.println("----------------------------------------------------------");
		Map map = new HashMap();
		//추가 같은 키에 넣는 경우 value가 업데이트된다
		map.put("k1", "v1");
		map.put("list", list);
		map.put("k1", "v2");	//키가 같은경우 덮어쓴다
		
		//가져오기
		String k1 = (String)map.get("k1");
		List list2 = (List)map.get("list");
		
		System.out.println(map);
		
		list = new ArrayList();
		map = new HashMap();
		map.put("제목", "일터");
		map.put("가수", "리쌍");
		list.add(map);
		System.out.println("----------------------------------------------------------");
		System.out.println(list);
		//마지막 값만 여러번 나온다면 new 해줘야 한다
		//이게 다~ 얕은 복사 때문임!
		map=new HashMap();
		map.put("제목", "시");
		map.put("가수", "수");
		list.add(map);
		System.out.println(list);
		
		// 제네릭 : <String, Integer>
		// 10점 짜리 설명 : 노란줄 없애기
		// 60점 짜리 설명 : 추가할 자료형을 제한한다
		// 100점 짜리 설명 : 전달인자나 리턴타입의 자료형을 동적으로 변경한다
		List<String> list3 = new ArrayList<String>();
//		list3.add(123);
		list3.add("String");
		list3.get(0);
		String s = list3.get(0);
		
		//제네릭에 원시타입은 사용할 수 없고, wrapper 클래스 사용
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("str", 123);
		int c = map2.get("str");
	}

}
