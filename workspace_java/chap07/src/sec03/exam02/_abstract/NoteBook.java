package sec03.exam02._abstract;

public class NoteBook extends Windows{
	
	@Override
	void boot () {
		System.out.println("�����");
		start();
	}
	
	
	@Override
	void start() {
		System.out.println("ī�� ����");
		System.out.println("���� ����");
	}

}
