package day17.ex;

import day17.Circle;

/*
 	문제1
 		삼각형의 정보를 기억할 Semo 클래스를 제작하고
 		삼각형의 넓이가 같으면 같은 삼각형으로 처리되도록 하세요(1)
 		
 		삼각형의 밑변이 같으면 같은 삼각형으로 처리되도록 하세요(2)
 		삼각형의 높이가 같으면 같은 삼각형으로 처리되도록 하세요(3)
 		
 		--> Semo1, Semo2, Semo3 클래스로 따로 만들어서 처리
 	문제2
 		--> 문제 1의 삼각형 대신 사각형으로 
 */

public class Ex01 {

	public Ex01() {
		
		Semo2 semo1 = new Semo2(5, 6);
		Figure semo2 = new Semo1(2, 6);
		
		System.out.println(semo1.equals(semo2));
		
	}

	public static void main(String[] args) {
		new Ex01();
	}		
		
	public void getFigure(int cnt) {
		
		Figure f = null;		
		Figure[] ff = new Figure[cnt];
		
		for(int i = 0 ; i < ff.length; i++) {		
		
			int no = (int)(Math.random()*3);
		
			switch(no) {
			case 0:
				for(i = 0 ; i < ff.length ; i++) {
					f = new Semo1();
					if(f.equals(ff[i])) {
						break;
					}
				}
				break;
			case 1:
				f = new Nemo();
				break;
			case 2:
				f = new Won();
				break;
			}
			
			ff[i] = f; 
		}
	}
}
