package day15;

public abstract class Test07 {
	/*
	 	추상클래스는 추상함수를 0개 이상 가지고 있는 클래스이다.
	 	따라서 추상클래스 안에는 추상함수가 없을 수도 있다.
	 */
	
	private int num = 1000;

	public int getNum() { // 일반함수
		return num;
	}

	public void setNum(int num) { // 일반함수
		this.num = num;
	}
	
	public abstract int addNum(int no); // 추상함수
	
}
