package day15;

public class Test03 extends Test02 {
	private final int NO;
	private final int NUM = 0;
	public Test03() {
		NO = 1000;

		/*
		 	�������� ����
		 		: �ɹ��� �ʱ�ȭ
		 		<-- ������ �Լ��� �ش� Ŭ������ ��ü�� �� �� ����Ǵ� �Լ���
		 			��ü�� �� �� �� Ŭ������ ��������� �ʱ�ȭ ���ִ� �۾��� �Ѵ�.
		 			�� ���� final �Ӽ��� �ο��� ����������
		 			���� �����Ͱ� ������ �ȵǾ��ִ� �����̴�.
		 			���� �����ڿ��� �����͸� ������ �� �ְ� �ȴ�.
		 			( ó�� �����͸� �����ϴ� �ܰ谡 �Ǳ⶧���� �����ϴ�.
		 */
		/*
		NUM = 500;
			--> final �Ӽ��� �ο��� ������
				�ѹ� �����Ͱ� ������ �Ǹ� �����͸� ������ �� ���� ������
				�� ���� ������ �߻��Ѵ�.
		
		*/
	}
	
	/*
	 	�������̵� ��Ģ
	 	0. ����� �޾ƾ� �Ѵ�.
	 	1. �Լ��� ������ �����Ѵ�. (�Լ��� ����: ��ȯ��Ÿ�� + �Լ��̸� + �Ű���������Ʈ)
	 	2. ���������ڴ� ���ų� ���� �������� �Ѵ�.
	 	3. ����ó���� ���ų� ������������ �Ѵ�.
	 */
	/*
	 // abc() �� final �Ӽ��� �ο��� �Լ��̰�
	 // �� �Ӽ��� �ο��� �Լ���
	 // �߿��� ����� �Լ��̹Ƿ�
	 // �Ժη� ���ļ� ������� �����
	 // �������̵带 ���Ƴ��� �Լ��̴�.
	public void abc() {
		System.out.println(" ����� Test01 Ŭ������ abc() �Լ� �������̵� ");
	}
	*/
}