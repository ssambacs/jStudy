package day21;


import java.io.*;
public class FileInputTest01 {

	public FileInputTest01() {
		// 할일
		// 1. 파일에 연결된 타겟스트림 준비
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src\\day21\\InputTest01.java");
			
			/*
			//1. 한글자만  읽어보자
			int ch = fin.read();
			System.out.println((char) ch);
			*/
			
			/*
			//2. 여러글자를 꺼내보자.
			byte[] buff = new byte[1024];
			int len = fin.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
			*/
			
			//3. 파일 전체 내용을 읽어보자
			// 이때 몇글자를 읽어야 할지 모르므로 반복문으로 처리
			while(true) {
				// 일단 한번 적당량을 읽어보자.
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				// 이때 반환값은 읽은 데이터 갯수이다. 
				// -1 이 반환된 경우는 더이상 읽을 데이터가 없는 경우이다.
				// 따라서 이 반복문을 종료한다.
				if(len == -1) {
					break;
				}
				//읽은 갯수만큼 문자열로 만들고				
				String str = new String(buff, 0, len);
				//출력
				System.out.print(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileInputTest01();

	}

}
