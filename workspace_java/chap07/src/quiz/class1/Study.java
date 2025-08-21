package quiz.class1;

public class Study {

	void getAnswer (Student student, String question){
		System.out.println(student.name+"에게 "+question+"에 대해서");
		System.out.println(question+"의 대답은 : "+student.answer(question));
	}
	
}
