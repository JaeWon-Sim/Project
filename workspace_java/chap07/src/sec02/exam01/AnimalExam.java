package sec02.exam01;

public class AnimalExam {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.think();
		a.eat();
		
		Cat c = new Cat();
		c.eat();
		c.groomming();
		
		Animal a1 = (Animal)c;	//�ڽ��� �θ� �ɶ�
		Animal a2 = c;			//�� ��ȯ ������ ���� ����
		
		a1.eat();
//		a1.clean();

//		Dog d = new Dog();
//		Animal a3 = new Dog();�ؿ� ���ٰ� ���� �ڵ�
		Animal a3 = new Dog();
		
//		new AnimalExam().catMom(c);
		catMom(c);
		
		animalCare(a3);
		animalCare(new Cat());
		
	}
	
	static void catMom(Cat c) {
		c.eat();
		c.groomming();
	}
	
	static void animalCare(Animal animal) {
		System.out.println("���̴�"+animal.age);
		animal.think();
		animal.eat();
		
	}
	
}
