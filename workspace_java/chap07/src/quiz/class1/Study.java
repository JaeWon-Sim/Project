package quiz.class1;

public class Study {

	void getAnswer (Student student, String question){
		System.out.println(student.name+"���� "+question+"�� ���ؼ�");
		System.out.println(question+"�� ����� : "+student.answer(question));
	}
	
}
