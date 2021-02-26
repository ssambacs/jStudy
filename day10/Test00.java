package day10;

import java.util.Arrays;

public class Test00 {

	public static void main(String[] args) {
			int[][] no = {
					{1,2,3,4,5},
					{2,3,4,5,6},
					{3,4,5,6,7},
					{4,5,6,7,8},
					{5,6,7,8,9},
					{4,5,6,7,8},
					{3,4,5,6,7},					
			};
			
			int[] no1 = new int[7];
			int[] no2 = new int[7];
			
			for(int i = 0; i < no.length; i++) {
				for(int j = 0; j < no.length; j++) {
					if(j == 1) {
						no1[i] = no[i][j];
					}else if (j == 4) {
						no2[i] = no[i][j];
					}
					
				}
			}
				System.out.println(Arrays.toString(no1));
				System.out.println(Arrays.toString(no2));
	}

}
