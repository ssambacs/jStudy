package day21;

/*
 	���̵� �׷� 3�׷��� �÷��ǿ� ��Ƽ� ����ϰ�
 	������ ����غ���
 	
 	����
 		����ũ - ����, ����, ����, ����
 		Ʈ���̽� - ����, ����, ���, �糪, ��ȿ, �̳�, ����, ä��, ����
 		�����̰� - ȿ��, �̹�, ����, ����, ��ȿ, ���, �Ƹ�, ����
 */
import java.util.*;
public class Test02 {

	public Test02() {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		String[] t1 = {"����", "����", "����", "����"};
//		--> List�� ��ȯ
		List<String> list = Arrays.asList(t1);
		// List�� ArrayList�� ��ȯ
		ArrayList<String> list0 = new ArrayList<String>(list);
		map.put("����ũ", list);
//		System.out.println(list);
		
		String[] t2 = {"����", "����", "���", "�糪", "��ȿ", "�̳�", "����", "ä��", "����"};
		List<String> list1 = Arrays.asList(t2);
		map.put("Ʈ���̽�", list1);
		
		String[] t3 = {"ȿ��", "�̹�", "����", "����", "��ȿ", "���", "�Ƹ�", "����"};
		List<String> list2 = Arrays.asList(t3);
		map.put("�����̰�", list2);
		
		// map�� ���� ���
		
		System.out.println(map.get("����ũ"));
		System.out.println(map.get("Ʈ���̽�"));
		System.out.println(map.get("�����̰�"));
	}

	public static void main(String[] args) {
		new Test02();

	}

}
