package day17.ex;

public class Semo1 extends Semo {	

	public Semo1() {	
		h = (int)(Math.random()*10 + 1);
		w = (int)(Math.random()*10 + 1);
		
		semoArea = getArea();
	}
	public Semo1(int h, int w) {	
		this.h = h;
		this.w = w; 	
	}
	
	public double getArea() {
		semoArea = h * w / 2.0;
		return semoArea;
	}
	
	public boolean equals(Object obj) {
		
		boolean bool = false;
		
		Semo1 tmp = (Semo1) obj;
		
		bool = this.getArea() == tmp.getArea();
		
		return bool;
	}

}
