package day17;

public class Circle {
	private int rad; // ������ ����
	private double arround, area;
	// ������ ����
	// �⺻������
	public Circle() {
		
	}
	// �������� ���õǸ�
	public Circle(int rad) {
		setRad(rad);
		setArea();
		setArround();
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	// �츮�� �� Ŭ������ ��ü�� �Ǿ����� �������� ������ ���� ������ ó���ϰ� �ʹ�.
	// �� ��� equals()�� �������̵� �ؼ� �������� ���ؼ� ��ȯ���ֵ��� ���ָ� �ȴ�.
	public boolean equals(Object obj) {
		//��ȯ�� ���� �����
		boolean bool = false;
		
		/*
		 	�� �κп��� bool�� �����͸� ���� ��ȯ���ָ� �Ǵµ�
		 	
		 	����� 
		 		�츮�� �� �Լ��� ����� ����
		 			circle1.equals(circle2)
		 		�̷� ���·� ����ϴµ� �̶� �� ��ü�� ��������� rad�� ���ؼ�
		 		�� ���� ������ true�� ��ȯ���ְ�
		 		�ٸ��� false�� ��ȯ���ָ� �ǰڴ�.
		 */
		
		// 1. ���� �Ű������� �� Ŭ����Ÿ������ ���� ����ȯ�� ���ش�.
		Circle tmp = (Circle) obj;
		
		// 2. ���� �������� ��ü�� ��� rad�� �Ű������� �Էµ� ��ü�� ��� rad�� �����ش�.
		bool = this.rad == tmp.rad;
		
		//��ȯ���ְ�
		return bool;
	}
	public void setArea() { //  �����ε�
		this.area = rad * rad * Math.PI;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArround() { // �����ε�
		this.arround = 2 * rad * Math.PI;
	}
	
	
	public String toString() {
		return "�������� " + rad + " �̰� �ѷ��� " + arround + " �̰� ������ "
				+ area + " �� ��";
	}
	
}
