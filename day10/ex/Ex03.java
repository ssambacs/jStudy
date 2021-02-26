package day10.ex;

/*
	1. width 에 정수를 입력받아 대입해주는 함수
	2. height에 정수를 입력받아 대입해주는 함수
	3. width와 height 를 이용해서 사각형의 면적을 계산하고 반환해주는 함수
	4. 정수 두개를 입력받아서 위에서 만든 함수를 사용해서 사각형의 가로세로를 셋팅하고
		면적을 출력해주는 기능의 함수
	
	프로그램을 제작하고 실행하세요.
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
