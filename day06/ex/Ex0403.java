package day06.ex;

	// 1 ~ 100 ������ ���� ���ϴµ� Ȧ������ ���� ���ϼ���
public class Ex0403 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100 ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum = sum + i;
			
		
		}
		System.out.println(sum);
	}
}
