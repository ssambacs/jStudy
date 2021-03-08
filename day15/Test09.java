package day15;

public class Test09 {

	public Test09() {
		int no = (int)(Math.random()* 10 + 1);
		
		Father01 f1 = null;
		// ¦�� �϶��� f1�� �׸�Ŭ������ �������ְ�
		// Ȧ�� �϶��� f1�� ����Ŭ������ ����������
		if(no % 2 == 0) {
			f1 = new Nemo();
		} else { 
			f1 = new Semo();
		}
		
		// ���
		System.out.println("no : "+ no);
		f1.display();
	}

	public static void main(String[] args) {
		new Test09();

	}

}

// ���õ� Ŭ������ ��ǥ�ϴ� ���� Ŭ������ ���� ����ϱ�� ����.
abstract class Father01 {
	// �� Ŭ������ ���� �����ڰ� ������ Ŭ����
	abstract void display(); // �߻��Լ� ����...
}

// ���� Father01 Ŭ������ ��ӹ��� Ŭ������ ������.
class Semo extends Father01{
	// �������̵� ��Ģ 1�� :  �Լ��� ������ �����ض�
	protected void display() {
		System.out.println("�� Ŭ������ ���� Ŭ����");
	}
}

// Father01 Ŭ������ ��ӹ��� �׸�Ŭ������ ������.
class Nemo extends Father01{
	public void display() {
		// �������̵� ��Ģ 2�� : ���������ڴ� ���ų� ���� ��������...
		System.out.println("�� Ŭ������ �׸� Ŭ����");
	}
	
}