package day21;

/*
 	board ��ü�� ����� ArrayList�� ����
 	�Խñ��� 5�� �Է��ϰ�
 	����Ʈ�� ���
 */
import java.util.*;
public class Test03 {

	public Test03() {
		ArrayList<Board> list = new ArrayList<Board>();
		addBoard(list);
		printList(list);
		// ������ ���
	}
	
	// ����Ʈ�� �Խñ� ������ִ� �Լ�
	public void addBoard(ArrayList<Board> l) {
		Board brd1 = new Board (1000, "kieun", "���� ù��°");
		Board brd2 = new Board (1001, "sin", "���� 2��°");
		Board brd3 = new Board (1002, "sooyun", "���� 3��°");
		Board brd4 = new Board (1003, "soo", "���� 4��°");
		Board brd5 = new Board (1004, "gook", "���� 5��°");
	
		// ����Ʈ ���
		l.add(brd1);
		l.add(brd2);
		l.add(brd3);
		l.add(brd4);
		l.add(brd5);
	}
	
	public void printList(ArrayList<Board> l) {
			System.out.printf("%4s | %10s | %20s\n", "�۹�ȣ", "���̵�", "������");
			System.out.println("-----------------------------------------------");
			for(int i = 0; i< l.size(); i++) {
			// ����Ʈ���� �ϳ� ������
			Board brd = l.get(i);
			// �������
			System.out.printf("%4s | %10s | %20s\n", brd.getBno(), brd.getId(), brd.getTitle());
			System.out.println("-----------------------------------------------");
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
