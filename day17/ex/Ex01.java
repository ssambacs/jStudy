package day17.ex;

import day17.Circle;

/*
 	����1
 		�ﰢ���� ������ ����� Semo Ŭ������ �����ϰ�
 		�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(1)
 		
 		�ﰢ���� �غ��� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(2)
 		�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(3)
 		
 		--> Semo1, Semo2, Semo3 Ŭ������ ���� ���� ó��
 	����2
 		--> ���� 1�� �ﰢ�� ��� �簢������ 
 */

public class Ex01 {

	public Ex01() {
		
		Semo2 semo1 = new Semo2(5, 6);
		Figure semo2 = new Semo1(2, 6);
		
		System.out.println(semo1.equals(semo2));
		
	}

	public static void main(String[] args) {
		new Ex01();
	}		
		
	public void getFigure(int cnt) {
		
		Figure f = null;		
		Figure[] ff = new Figure[cnt];
		
		for(int i = 0 ; i < ff.length; i++) {		
		
			int no = (int)(Math.random()*3);
		
			switch(no) {
			case 0:
				for(i = 0 ; i < ff.length ; i++) {
					f = new Semo1();
					if(f.equals(ff[i])) {
						break;
					}
				}
				break;
			case 1:
				f = new Nemo();
				break;
			case 2:
				f = new Won();
				break;
			}
			
			ff[i] = f; 
		}
	}
}
