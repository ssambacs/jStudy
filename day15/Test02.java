package day15;

public class Test02 {

	public Test02() {
		/*
		 	이렇게 함수에 final 속성이 부여되면
		 	이 함수는 더이상 오버라이드를 할 수 없는 함수가 된다.
		 	
		 */
	}
	
	public  final void abc() {
		System.out.println(" 여기는 Test02 클래스의 abc() 함수 ");
	}

}
