package sec01.exam08;

public class StringExam {

	public static void main(String[] args) {
		
		System.gc();//garbage collector ���� ȣ��
		
		String s1 = "�����̻�����ĥ�ȱ����";
		
//		char c = s1.charAt(100); StringIndexOutOfBoundsException ���� �߻�
		char c = s1.charAt(0);
		System.out.println("char c : "+c);
		
		int i1 = s1.indexOf("���");
		System.out.println(i1);
		int i2 = s1.lastIndexOf("���");
		System.out.println(i2);
		int i3 = s1.indexOf("a");
		System.out.println(i3);	//���� -1
		
		
//		�̸��� ��� ����
//		@�� .�� �ϳ� �̻� �ִ°�?
		String email = "kion2313@naver.com";
		
		int e1 = email.indexOf("@");
		int e2 = email.indexOf(".");
		
		
		if(e1 == -1 && e2 == -1) {
			System.out.println("NO.");
		}else if(e2-e1<0){
			System.out.println("NO.");
		}else{
			System.out.println(email+"��밡��");
		}
		
		int idx = -1;
		// indexOf ����
		// email�� @�� ���° �ִ��� charAt
		for(int i = 0; i<email.length(); i++) {
			if((char)email.charAt(i)=='@') {
				idx = i;
				break;
			}
		}
		System.out.println(idx);
		
		String s2 = s1.replace("���", "34");
		System.out.println(s1);
		System.out.println(s2);
		// java�� replace�� ��� �ٲ��ش�!
		
		//���ۺ��� �� �ٷ� �ձ���
		String s3 = s1.substring(5,8);
		System.out.println(s3);
		
		//�ֹι�ȣ�� ���� ���� ����
		String ssn = "123456-1234567";
		
			if(ssn.substring(7,8).equals("1")) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
		String s5 = "   �۾�     �߰� ����    ";
		System.out.println("["+s5+"]");
		System.out.println("["+s5.trim()+"]");
		
		String menu = "���,���,���,��ġ���,��������";
		String[] menus = menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "blog.naver.com";
		//split ���� ǥ������ ���(String �ƴԿ� ����)
		//.�� ���� ǥ���Ŀ��� ����ϴ� ������ ����.���� �νĺҰ�
//		String [] urls = url.split("."); 
//		String [] urls = url.split("\\.");//���� ǥ���ϴ� ���:1
		String [] urls = url.split("[.]");//���� ǥ���ϴ� ���:2
		System.out.println(urls.length);
		
		String a = "a";
		a += "b";
		a = a+"c";
		
		//StringBuffer
		//�޸𸮸� ȿ�������� ����Ѵ�
		//StringBuilder���� ���� �ణ ����
		//�����忡 �����ϴ�(Thread-safe)
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c");
		String d = sb.toString();
		
		StringBuilder sbb = new StringBuilder("a");
		sbb.append("b");
		String d2 = sbb.toString();
		
	}

}
