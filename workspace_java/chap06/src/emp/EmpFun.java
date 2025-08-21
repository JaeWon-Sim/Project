package emp;

public class EmpFun {
	Emp[] e = new Emp[2];
	EmpFun() {
		i();
	}
	void i () {
		e[0] = new Emp();
		e[0].ename = "심재원";
		e[0].mgr = "김동현";
		e[0].empno = 0001;
		e[0].sal = 8000;
	
		e[1] = new Emp();
		e[1].ename = "smith";
		e[1].mgr = "심재원";
		e[1].empno = 0003;
		e[1].sal = 5000;
	}
	/**
	 * 전체 사원 출력
	 * 메소드명 : selectAll
	 * 전달인자 : 없음
	 * 리턴타입 : 없음
	 * 전체 배열 돌면서 이름만 출력하기
	 */
	void selectEname() {
		for(int i = 0; i<e.length; i++) {
			System.out.println(e[i].ename);
		}
	}
	/**
	 * 메소드명 : salgrade
	 * 전달인자 : int
	 * 리턴타입 : 없음
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
