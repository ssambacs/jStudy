package day06;

/*
  	-1	+ 2 -3 +4 -5.......
  	ó�� 100�� �ѱ�� ����� ������ ȸ���� ���
 */
public class Test02 {
	public static void main(String[] args) {
		
		int sum = 0;
		int gop = -1;
		int num = 0;
		
		for(int i = 1; ; i++) { // �̷��� ���ǽĿ� �ƹ��͵� ������� ������ �׻� true
			gop = gop * -1;
			int no = i * gop;
			sum = sum + (i * gop);
			
			num = i;
			if(sum > 100) break;
			// if���� ��� �̷��� ������ ������ ����� �ϳ��� ���� �ҷ���ȣ�� ���� ����
		}
		System.out.println(num + " ȸ�� : �հ� " + sum);
	}
}
