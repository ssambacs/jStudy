package day10;

/*
 	밑변과 높이를 랜덤한 정수로 가지는 삼각형의 넓이를 출력해주는 기능의 함수(samgak)을 만들고
 	실행하세요
 */
public class Test03 {
	public Test03(){
		// 삼각형함수 호출
		samgak();
	}

	public static void main(String[] args) {
		new Test03();
		

	}
	
	void samgak() {
		// 랜덤하게 밑변과 높이 기억
		int width = (int)(Math.random()*21 + 5);
		int height = (int)(Math.random()*21 + 5);
		
		// 넓이 계산
		double area = width * height / 2.;
		
		// 출력
		System.out.println("밑변 : "+ width);
		System.out.println("높이 : "+ height);
		System.out.println("넓이 : "+ area);
		
		// return;
	}
}
