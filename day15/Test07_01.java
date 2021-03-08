package day15;

public class Test07_01 extends Test07 {

	public Test07_01() {
		
	}

	public static void main(String[] args) {
		/*
		 	이 클래스는 Test07 이라는 추상클래스를 상속받아서 만들어진 클래스이다.
		 	Test07 의 객체는  스스로 new 시켜서 만들어 사용할 수 없기 때문에
		 	상속을 받은 클래스를 new 시켜서 상속해준 타입으로 사용하면 된다.
		 */
		
		Test07 t7 = new Test07_01();
//		Test07 t7_00 = new Test07(); // 이 경우는 몸체가 없는 미완성의 함수가 있기 때문에 안된다.
		
		System.out.println("Test07.addNum() : " + t7.addNum(500));
		
	}

	// 상속해준 추상클래스의 추상하수를 오버라이딩
	public int addNum(int no) {
		/*
		 	오버라이딩 규칙
		 		0. 상속을 받아야한다.
		 		1. 함수의 원형을 유지해야 한다.(반환값타입 + 함수이름 + 매개변수리스트)
		 		2. 접근지정자는 같거나 넓은 방향으로 작성한다.
		 		3. 예외처리는 같거나 좁은 방향으로 처리한다.
		 */
		// 이 함수는 입력받은 데이터를 num 에서 빼준 값을 반환해주는 함수로 사용하기로 한다.

		// 반환값 변수 만들고
		int result = getNum() + no ;
		/*
		 	Test07의 num 변수의 접근지정자는
		 		private 이고 같은 클래스 내에서만 접근할 수 있으므로
		 		상속 받은 이 클래스에서는 변수에 직접 접근하는 것은 불가능하다.
		 		따라서 이때를 위해서 getxxx(), setxxx() 함수를 만들어 뒀고
		 		이 작업을 "은닉화"라 부른다.
		 	
		 	따라서 변수를 사용하려면 함수를 호출해서 사용해야 한다.		 		
		 */
		
		// 결과 반환
		return result;		
	}
}
