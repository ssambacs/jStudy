package day06.ex;

/*
 	����2
 		�����̰� �����븦(100����)�� �ö󰣴�.
 		������ 0.87���͸� �ö󰡰�
 		�㿡�� 0.35���͸� �̲�������.
 		
 		���ϸ��� �� �����̴� ���� �ö� ���ΰ�?
 		��, ����⿡ �ö󰡸� �̲����� ����.
 */
public class Ex02 {

	public static void main(String[] args) {
		double mt = 0;
		int day = 0;
		boolean complete = false;
		
		for(int i = 1 ; ; i++) {
			day = i;
			mt = mt + 0.87;
			
			if (mt >= 100) {
				complete = true;
				break;
			}
			mt = mt - 0.35;
		
		 
		}
		if(complete) {// complete ==> true
			System.out.println(" �ݺ��� �߰��� ����!!!");
		}
		System.out.println(day + "�� " + mt);

	}

}
