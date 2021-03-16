package day21;

import java.io.*;

/*
 	파일에 저장하는 프로그램을 작성하세요
 	단, Buffered 스트림을 사용하세요.
 */
public class BufferedTest01 {

	public BufferedTest01() {
		// 1. 반드시 타겟(기본) 스트리이 필요하다.
		FileOutputStream fout = null;
		// 2. 필요에 따라서 필터(보조)스트림을 연결할 수 있다.
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day21/buffTest.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "이것은 파일에 저장하는 프로그램의 결과물\nBufferedOutputStream 사용...";
			byte[] buff = str.getBytes();
			bout.write(buff);
			/*
			 	아직 버퍼가 차지 않았으므로 버퍼의 내용이 FileOutputStream 으로 전달되지 않았다.
			 	따라서 저장이 정상적으로 되지 않을 수도 있다.
			 	
			 	반드시 습관적으로 완료된 시점에서 버퍼를 비우는 습관을 가져야 겠다.
			 */
			bout.flush();
			
			System.out.println("저장완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedTest01();

	}

}
