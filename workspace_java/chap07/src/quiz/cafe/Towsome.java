package quiz.cafe;

public class Towsome extends Cafe{

	Menu [] menu = new Menu[3];
	
	Towsome(){
		super("towsome");
		setMenu();
	}
	
	void setMenu() {
		menu[0] = new Menu();
		menu[0].coffee = "아이스아메리카노";
		menu[0].price = 3000;
		
		menu[1] = new Menu();
		menu[1].coffee = "라때";
		menu[1].price = 5000;
		
		menu[2] = new Menu();
		menu[2].coffee = "어어";
		menu[2].price = 6000;
	}
}
