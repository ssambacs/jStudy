package day21;

/*
 	board 객체를 기억할 ArrayList를 만들어서
 	게시글을 5갤 입력하고
 	리스트를 출력
 */
import java.util.*;
public class Test03 {

	public Test03() {
		ArrayList<Board> list = new ArrayList<Board>();
		addBoard(list);
		printList(list);
		// 꺼내서 출력
	}
	
	// 리스트에 게시글 등록해주는 함수
	public void addBoard(ArrayList<Board> l) {
		Board brd1 = new Board (1000, "kieun", "내가 첫번째");
		Board brd2 = new Board (1001, "sin", "내가 2번째");
		Board brd3 = new Board (1002, "sooyun", "내가 3번째");
		Board brd4 = new Board (1003, "soo", "내가 4번째");
		Board brd5 = new Board (1004, "gook", "내가 5번째");
	
		// 리스트 담고
		l.add(brd1);
		l.add(brd2);
		l.add(brd3);
		l.add(brd4);
		l.add(brd5);
	}
	
	public void printList(ArrayList<Board> l) {
			System.out.printf("%4s | %10s | %20s\n", "글번호", "아이디", "글제목");
			System.out.println("-----------------------------------------------");
			for(int i = 0; i< l.size(); i++) {
			// 리스트에서 하나 꺼내고
			Board brd = l.get(i);
			// 내용출력
			System.out.printf("%4s | %10s | %20s\n", brd.getBno(), brd.getId(), brd.getTitle());
			System.out.println("-----------------------------------------------");
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
