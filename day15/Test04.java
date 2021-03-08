package day15;

public class Test04 {

	public Test04() {
		System.out.println("여기는 Test04 생성자");
	}
	public void abc() {
		System.out.println("### 여기는 Test04 abc() ####");
	}
	public static void main(String[] args) {
		Object o = new Test04();
		/*
		o.abc();
		--> Object 클래스에는 abc() 함수가 존재하지 않기 때문에
			이렇게 호출하는 것은 안된다.
		*/
	}

}
