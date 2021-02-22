package day06.ex;

	// 1 ~ 100 까지의 합을 구하는데 홀수만의 합을 구하세요
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
