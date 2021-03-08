package day15.ex;

/*
    	문제 
  		Figure 클래스를 상속받은 Semo, Nemo, Won 클래스를 만들고
  		각 도형의 정보를 출력하세요.
  		
  		작업 순서
  			1. 상속 받은 클래스를 정의한다.
  			2. 상속 받은 클래스의 객체를 만들어서 Figure 클래스의 변수로 받아서 사용
  			3. 정보를 출력한다.
 */
public class Ex01 {

	public Ex01() {
		getDate(5);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}
	
	public void getDate(int cnt) {

		Figure[] ff = new Figure[cnt];
		
		for(int i = 0 ; i < ff.length; i++) {
			ff[i] = getFigure();
		}
		for(Figure f : ff) {
			f.toPrint();
		}
	}
	public Figure getFigure() {
		Figure f = null;
		
		int no = (int)(Math.random()*3);
		
		switch(no) {
		case 0:
			f = new Semo();
			break;
		case 1:
			f = new Nemo();
			break;
		case 2:
			f = new Won();
			break;
		}
		
		return f;
	}
}
