package day17.ex;

public class Semo3 extends Semo {

	public Semo3() {	
		h = (int)(Math.random()*10 + 1);
		w = (int)(Math.random()*10 + 1); 	
	}
	public Semo3(int h, int w) {	
		this.h = h;
		this.w = w; 	
	}
	public boolean equals(Object obj) {
		
		boolean bool = false;
		
		Semo1 tmp = (Semo1) obj;
		
		bool = this.h == tmp.h;
		
		return bool;
	}
}
