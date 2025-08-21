package quiz.class1;

public class JaewonController extends Student{
	
	JaewonController(){
		super("Àç¿ø");
	}

	JaewonService jaewonservice = new JaewonService();
	
	@Override
	String answer (String question){
		String result = jaewonservice.getInfo(question);
		return result;
	}
	
}
