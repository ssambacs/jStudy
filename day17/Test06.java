package day17;


/*
 	�����ϰ� ������ �߻��Ͽ� �迭�� ������ ��
 	������������ �����Ͽ� ����ϼ���.
 */
import java.util.*;
public class Test06 {

	public Test06() {
		int[] nums = new int[20];
		
		// Random Ŭ���� ����� �غ�
		Random rdn = new Random();
		
		for(int i = 0 ; i< 20; i++) {
			// ���� ��������
			int no = rdn.nextInt(100); // 0 ~ 100 ������ ������ �߻���Ű����...
			//�迭�� ������ ä���
			nums[i] = no;
		}
		//�迭 ���� ����ϰ�
		System.out.println(Arrays.toString(nums));
		
		//�������� ����
		Arrays.sort(nums);
		//����ϰ�
		for(int no : nums) {
			System.out.print(no + " | ");
		}
	}

	public static void main(String[] args) {
		new Test06();

	}

}
