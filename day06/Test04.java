package day06;

/*
 	5���� �޸𸮸� �迭�� �����
 	�� �ȿ� ������ ����(����)�� �Է��� �� �������.
 */
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		// �ּҸ� ����� ������ �غ�
		int[] num = new int[6];
		
		/*
		 * num[0] = (int)(Math.random()*45 +1 ); num[1] = (int)(Math.random()*45 +1 );
		 * num[2] = (int)(Math.random()*45 +1 ); num[3] = (int)(Math.random()*45 +1 );
		 * num[4] = (int)(Math.random()*45 +1 ); num[5] = (int)(Math.random()*45 +1 );
		 */
		
		for(int i = 0; i < 6; i++) {
			num[i] = (int)(Math.random()*45 +1);
		}
		
		
		// ���
		/*
		 * System.out.println(num[0]); 
		 * System.out.println(num[1]);
		 * System.out.println(num[2]);
		 * System.out.println(num[3]);
		 * System.out.println(num[4]); 
		 * System.out.println(num[5]);
		 */
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " | ");	
		}
		System.out.println();
		
		  String str = Arrays.toString(num); 
		  System.out.println(Arrays.toString(num));
		  System.out.println(str);
		 
	}
}
