package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		//add �߰�
		list.add(123);
		list.add("�۾�");
		
		//�߰��� ����
		list.add(1, "����");
		System.out.println(list);
		
		System.out.println(list.contains(123));
		System.out.println(list.get(1));//object�� toString�� ������ ������ �Ǽ� ����
		
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
		//�߰� ���� Ű�� �ִ� ��� value�� ������Ʈ�ȴ�
		map.put("k1", "v1");
		map.put("list", list);
		map.put("k1", "v2");	//Ű�� ������� �����
		
		//��������
		String k1 = (String)map.get("k1");
		List list2 = (List)map.get("list");
		
		System.out.println(map);
		
		list = new ArrayList();
		map = new HashMap();
		map.put("����", "����");
		map.put("����", "����");
		list.add(map);
		System.out.println("----------------------------------------------------------");
		System.out.println(list);
		//������ ���� ������ ���´ٸ� new ����� �Ѵ�
		//�̰� ��~ ���� ���� ������!
		map=new HashMap();
		map.put("����", "��");
		map.put("����", "��");
		list.add(map);
		System.out.println(list);
		
		// ���׸� : <String, Integer>
		// 10�� ¥�� ���� : ����� ���ֱ�
		// 60�� ¥�� ���� : �߰��� �ڷ����� �����Ѵ�
		// 100�� ¥�� ���� : �������ڳ� ����Ÿ���� �ڷ����� �������� �����Ѵ�
		List<String> list3 = new ArrayList<String>();
//		list3.add(123);
		list3.add("String");
		list3.get(0);
		String s = list3.get(0);
		
		//���׸��� ����Ÿ���� ����� �� ����, wrapper Ŭ���� ���
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("str", 123);
		int c = map2.get("str");
	}

}
