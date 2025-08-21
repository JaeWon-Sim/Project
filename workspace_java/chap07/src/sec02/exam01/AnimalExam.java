package sec02.exam01;

public class AnimalExam {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.think();
		a.eat();
		
		Cat c = new Cat();
		c.eat();
		c.groomming();
		
		Animal a1 = (Animal)c;	//자식이 부모가 될때
		Animal a2 = c;			//형 변환 연산자 생략 가능
		
		a1.eat();
//		a1.clean();

//		Dog d = new Dog();
//		Animal a3 = new Dog();밑에 한줄과 같은 코드
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
		System.out.println("나이는"+animal.age);
		animal.think();
		animal.eat();
		
	}
	
}
