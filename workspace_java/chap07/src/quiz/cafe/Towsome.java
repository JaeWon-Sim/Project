package quiz.cafe;

public class Towsome extends Cafe{

	Menu [] menu = new Menu[3];
	
	Towsome(){
		super("towsome");
		setMenu();
	}
	
	void setMenu() {
		menu[0] = new Menu();
		menu[0].coffee = "���̽��Ƹ޸�ī��";
		menu[0].price = 3000;
		
		menu[1] = new Menu();
		menu[1].coffee = "��";
		menu[1].price = 5000;
		
		menu[2] = new Menu();
		menu[2].coffee = "���";
		menu[2].price = 6000;
	}
}
