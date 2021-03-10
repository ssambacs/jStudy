package day17.ex;

public class Semo2 extends Semo {

	public Semo2() {	
		h = (int)(Math.random()*10 + 1);
		w = (int)(Math.random()*10 + 1); 	
	}
	public Semo2(int h, int w) {	
		this.h = h;
		this.w = w; 
	}
	public boolean equals(Object obj) {
		
		boolean bool = false;
		
		Semo1 tmp = (Semo1) obj;
		
		bool = this.w == tmp.w;
		
		return bool;
	}

}
