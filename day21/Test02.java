package day21;

/*
 	아이돌 그룹 3그룹을 컬렉션에 담아서 기억하고
 	내용을 출력해보자
 	
 	보기
 		블랙핑크 - 제니, 지수, 로제, 리사
 		트와이스 - 나연, 정연, 모모, 사나, 지효, 미나, 다현, 채영, 쯔위
 		오마이걸 - 효정, 미미, 유아, 승희, 지효, 비니, 아린, 진이
 */
import java.util.*;
public class Test02 {

	public Test02() {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		String[] t1 = {"제니", "지수", "로제", "리사"};
//		--> List로 변환
		List<String> list = Arrays.asList(t1);
		// List를 ArrayList로 변환
		ArrayList<String> list0 = new ArrayList<String>(list);
		map.put("블랙핑크", list);
//		System.out.println(list);
		
		String[] t2 = {"나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위"};
		List<String> list1 = Arrays.asList(t2);
		map.put("트와이스", list1);
		
		String[] t3 = {"효정", "미미", "유아", "승희", "지효", "비니", "아린", "진이"};
		List<String> list2 = Arrays.asList(t3);
		map.put("오마이걸", list2);
		
		// map의 내용 출력
		
		System.out.println(map.get("블랙핑크"));
		System.out.println(map.get("트와이스"));
		System.out.println(map.get("오마이걸"));
	}

	public static void main(String[] args) {
		new Test02();

	}

}
