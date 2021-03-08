package day15.ex;

public class Won extends Figure {

	int rad;
	
	public Won() {	
		rad = (int)(Math.random()*10 + 1);	
	}
	
	public double getArea() {
		double area = rad * rad * Math.PI;
		return area;
	}
	
	public  void toPrint() {
		System.out.printf("원의 반지름 : %2d, 둘레 : %5.2f, 넓이 : %5.2f \n "
				, rad, doolea(), getArea());
	}
	public double doolea() {
		double doolea = 2 * rad * Math.PI;
		return doolea;
	}
}
