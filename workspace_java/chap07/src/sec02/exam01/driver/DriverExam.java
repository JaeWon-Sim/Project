package sec02.exam01.driver;

import java.util.ArrayList;
import java.util.HashMap;

public class DriverExam {
	public static void main(String[] args) {
		Tico tico = new Tico();
		
		Driver driver = new Driver();
		
		driver.driveTico(tico);
		System.out.println("asdfasdf");
		Porsche911gts p = new Porsche911gts();
		Car c = (Car) p;
		driver.drive(c);
		driver.drive(tico);
		
		ArrayList list = new ArrayList();
		list.add(driver);
		Driver d = (Driver)list.get(0);
		
		HashMap map = new HashMap();
		map.put("key", "value"); // �ִ¹�
		String k = (String)map.get("key");//������ ��
	}

}
