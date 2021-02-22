package day06.ex;

import java.util.*;
public class Ex00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 숫자 입력 : ");
		int num = sc.nextInt();
		int no = num / 2;
		
		for(int i = 0 ; i < num ; i++) {
			
			if(i<= no) {
				for(int j = 0 ; j < num ; j++) {	
							
					if(j >= no-i && j <= no + i) {
					System.out.print('*');
			     	} else {
			     		System.out.print(' ');
			     	}
					;
			    }
			} else { 
				for(int j = 0 ; j < num ; j++) { 	
					
					if (j >= i - no && j <= 3 * no - i ) {
						System.out.print('*');
					} else{
						System.out.print(' ');
					}
				} 
			}
			System.out.println();	 			
		 }
		
		System.out.println("010101010101");
		System.out.println("가나다라마바사");
	}
}
