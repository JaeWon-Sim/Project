package quiz.class1;

import java.util.HashMap;

public class JaewonDAO {
	
	HashMap map = new HashMap();
	
	JaewonDAO(){
		map.put("����","û����");
		map.put("����","�޽Ĵ�");
		map.put("ȸ��","����?");
		map.put("�޽�","��?");
	}
	
	String selectAnswer(String question) {
		return (String)map.get(question);
	}

}
