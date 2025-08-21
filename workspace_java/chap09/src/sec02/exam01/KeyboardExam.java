package sec02.exam01;

public class KeyboardExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KeyboardImpl k1 = new KeyboardImpl();
		Keyboard k2 = (Keyboard) new KeyboardImpl();
		Keyboard k3 = new KeyboardImpl();
		System.out.println(k2.press(13));
		
		
//		Keyboard k4 = new Keyboard();
		
		Keyboard k5 = new Keyboard() {
			@Override
			public String press(int keyCode) {
				if(keyCode == 13) {
					return "enter";
				}
				return "¹º°¡ ´­¸²";
				
			}
		};
System.out.println("");
	
	
	}
}
