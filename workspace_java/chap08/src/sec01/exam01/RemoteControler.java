package sec01.exam01;

//new() �Ұ�!
public interface RemoteControler {

	public static final int MAX_VOLUME = 10;
	// ��� �ʵ�� public static final(���) �̴�
	// �׷��� ���� �����ϴ�!
	public int MIN_VOLUME = 0;
	
	
	public abstract void turnOn();
	//�⺻������ �޼ҵ�� abstract(�߻�) �޼ҵ��
	//�׷��� ���� �����ϴ�
	public void turnOff();
	public void setVolume(int vol);
	
	
	//�տ� dafualt�� �Ἥ �����ؼ� �� �� ����;
	default void mic(String text) {
		
	}
}
