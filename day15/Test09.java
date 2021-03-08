package day15;

public class Test09 {

	public Test09() {
		int no = (int)(Math.random()* 10 + 1);
		
		Father01 f1 = null;
		// 짝수 일때는 f1에 네모클래스를 대입해주고
		// 홀수 일때는 f1에 세모클래스를 대입해주자
		if(no % 2 == 0) {
			f1 = new Nemo();
		} else { 
			f1 = new Semo();
		}
		
		// 출력
		System.out.println("no : "+ no);
		f1.display();
	}

	public static void main(String[] args) {
		new Test09();

	}

}

// 관련된 클래스를 대표하는 상위 클래스를 만들어서 사용하기로 하자.
abstract class Father01 {
	// 이 클래스는 접근 지정자가 생략된 클래스
	abstract void display(); // 추상함수 선언...
}

// 위의 Father01 클래스를 상속받은 클래스를 만들자.
class Semo extends Father01{
	// 오버라이딩 규칙 1번 :  함수의 원형을 유지해라
	protected void display() {
		System.out.println("이 클래스는 세모 클래스");
	}
}

// Father01 클래스를 상속받은 네모클래스를 만들어보자.
class Nemo extends Father01{
	public void display() {
		// 오버라이딩 규칙 2번 : 접근지정자는 같거나 넓은 방향으로...
		System.out.println("이 클래스는 네모 클래스");
	}
	
}