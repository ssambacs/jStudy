package day15.ex;

public class Semo extends Figure {

	int h;
	int w;
	
	public Semo() {	
		h = (int)(Math.random()*10 + 1);
		w = (int)(Math.random()*10 + 1); 	
	}
	
	public double getArea() {
		double area = h * w / 2.0;
		return area;
	}
	
	public  void toPrint() {
		System.out.printf("������ ���� : %2d, ���� : %2d, ���� : %5.2f \n "
				, h, w, getArea());
	}
}
