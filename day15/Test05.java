package day15;

public class Test05 {

	public Test05() {
		Grand g1 = new Son();		
		g1.abc();
		
		Grand g2 = new Father();		
		g2.abc();
		
		Grand g3 = new Son();
//		g3.xyz(); // Grand Ŭ�������� xyz() �Լ��� ����� �������� �ʱ� ������ ��� �� �� ����.
		
		System.out.println(" g1 instanceof Grand  : " + (g1 instanceof Grand));
		System.out.println(" g1 instanceof Grand  : " + (g1 instanceof Father));
		System.out.println(" g2 instanceof Grand  : " + (g2 instanceof Son));

		System.out.println("g1 : " + g1);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
