package day10.ex;

/*
	1. width �� ������ �Է¹޾� �������ִ� �Լ�
	2. height�� ������ �Է¹޾� �������ִ� �Լ�
	3. width�� height �� �̿��ؼ� �簢���� ������ ����ϰ� ��ȯ���ִ� �Լ�
	4. ���� �ΰ��� �Է¹޾Ƽ� ������ ���� �Լ��� ����ؼ� �簢���� ���μ��θ� �����ϰ�
		������ ������ִ� ����� �Լ�
	
	���α׷��� �����ϰ� �����ϼ���.
 */
import java.util.*;
public class Ex03 {
	int width;
	int height;
	int result;
	
	public Ex03() {
		setW(4);
		setH(5);
		result = area();
		System.out.println(result);
		
		result = areaF(7, 7);
		System.out.println(result);
	}
	public static void main(String[] args) {
		new Ex03();

	}
	
	public void setW(int w) {
		width = w;		
	}
	
	public void setH(int h) {
;
		height = h;
	}
	
	public int area() {
	int area1 = width * height;
	return area1;
	}
	
	public int areaF(int w, int h) {
	setW(w);
	setH(h);
	int area2 = area();
	return area2;
	}
}
