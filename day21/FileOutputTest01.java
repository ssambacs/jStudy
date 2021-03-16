package day21;

/*
 	이 프로그램에서 파일을 만들고
 	파일의 내용도 입력해보자.
 */

import java.io.*;
public class FileOutputTest01 {

	public FileOutputTest01() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("D:\\class\\java\\example\\day21\\FileText.txt");
			// 파일이 존재하지 않아도 자동으로 만들어 준다.
			/*
			//1. 한글자만 입력해보자.
			fout.write('A');
			*/
			
			/*
			//2. 여러글자를 내보내보자.
			String str = "then he whent on with his reflections : ";
			byte[] buff = str.getBytes();
			fout.write(buff);
			*/
			
			// 3. 
			String str = "I Am A Boy, My Name Is Hong Gil Dong";
			byte[] buff = str.getBytes();
			fout.write(buff, 12, buff.length - 12);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 외부장치와 연결된 경우는 해당 외부장치의 사용이 종료되면 
			// 반드시 닫아주는 것이 원칙이다.
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileOutputTest01();

	}

}
