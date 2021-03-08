package day15.ex;

/*
    	���� 
  		Figure Ŭ������ ��ӹ��� Semo, Nemo, Won Ŭ������ �����
  		�� ������ ������ ����ϼ���.
  		
  		�۾� ����
  			1. ��� ���� Ŭ������ �����Ѵ�.
  			2. ��� ���� Ŭ������ ��ü�� ���� Figure Ŭ������ ������ �޾Ƽ� ���
  			3. ������ ����Ѵ�.
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
