package day15.ex;

public class Nemo extends Figure {
	
	
	int h;
	int w;
	
	public Nemo() {	
		h = (int)(Math.random()*10 + 1);
		w = (int)(Math.random()*10 + 1); 		
	}
	
	public double getArea() {
		double area = h * w;
		return area;
	}
	
	public  void toPrint() {
		System.out.printf("네모의 가로 : %2d, 세로 : %2d, 넓이 : %5.2f \n "
				, h, w, getArea());
	}
}
