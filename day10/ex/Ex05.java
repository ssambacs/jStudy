package day10.ex;

/*

���� 5 ]
	�� ���� �̿��ؼ� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
		1. ������ ���ڸ� ��ȯ���ִ� �Լ�
		2. ���� �ΰ��� �Է��ϸ� ������ ���� ��ȯ���ִ� �Լ�
		3. ������ִ� �Լ�
		
	������ ���� �Լ��� �̿��ؼ� ����ϼ���.
 */
public class Ex05 {
	int result;
	public Ex05() {
		
		result = sum(3, 5);
		pr();
	}
	public static void main(String[] args) {
		new Ex05();
	}
	public int num() {
		int no = (int)(Math.random()*10);
		return no;
	}
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	public void pr() {
		System.out.println(result);
	}
}
