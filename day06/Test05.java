package day06;

/*
 	10���� ���ڸ� ����� �޸𸮸� �����
 	�޸𸮿� 'A' ~ 'J'���� ���ʷ� ��� �� �� ��� �ϼ���.
 */
public class Test05 {

	public static void main(String[] args) {
		// �ּ� ��� ���� �غ�
		char[] ch ;
		
		// Heap�� �޸� ���� Ȯ��
		
		ch = new char[10];
		
		// �ݺ��ؼ�  ���濡 ������ ä���
		
		for(int i = 0 ; i < 10 ; i++) {
			// 'A' + 0 --> 'A'
			// 'A' + 1 --> 'B' 
			// 'B' + 1 --> 'C'
			ch[i] = (char)('A' + i);
		}
		
		// ����Ѵ� .�ϳ��� ������
		
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.print(ch[i] + ", ");
		}
		System.out.println();
		
		// ���� for ��� (forEach ���)
		for(char c : ch) {
			// �� �ݺ����� �迭(ch)�� ��� ������ �ϳ��� ������
			// ���� c �� ���������� ���Խ�Ų��.
			// ��������� ��� �����͸� ���������� ������ ó���ϰ� ����ȴ�.
			System.out.print(c + ", ");
		}
	}

}
