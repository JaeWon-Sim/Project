package emp;

public class EmpFun {
	Emp[] e = new Emp[2];
	EmpFun() {
		i();
	}
	void i () {
		e[0] = new Emp();
		e[0].ename = "�����";
		e[0].mgr = "�赿��";
		e[0].empno = 0001;
		e[0].sal = 8000;
	
		e[1] = new Emp();
		e[1].ename = "smith";
		e[1].mgr = "�����";
		e[1].empno = 0003;
		e[1].sal = 5000;
	}
	/**
	 * ��ü ��� ���
	 * �޼ҵ�� : selectAll
	 * �������� : ����
	 * ����Ÿ�� : ����
	 * ��ü �迭 ���鼭 �̸��� ����ϱ�
	 */
	void selectEname() {
		for(int i = 0; i<e.length; i++) {
			System.out.println(e[i].ename);
		}
	}
	/**
	 * �޼ҵ�� : salgrade
	 * �������� : int
	 * ����Ÿ�� : ����
	 * 
	 */
	void initEmp(String a, String b, int c, int d) {
		Emp[] e = new Emp[this.e.length+1];
		for(int i = 0; i<this.e.length; i++) {
			this.e[i]=this.e[i];
		}
		e[this.e.length] = new Emp();
		e[this.e.length].ename = a;
		e[this.e.length].mgr = b;
		e[this.e.length].empno = c;
		e[this.e.length].sal = d;
	}
	
	
	
}
