package day21;

/*
 	doc 폴더의 파일의 목록을 알아내자.
 */

import java.io.*;
public class FileTest02 {

	public FileTest02() {
		// 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir = new File("doc");
		
		/*
		// 목록 리스트 구하기.
		String[] flist = dir.list();
		// 출력
		for(int i = 0; i < flist.length ; i++) {
			System.out.println(flist[i]);
		}
		*/
		/*
		// 정보 포함해서 리스트 구하기
		File[] flist = dir.listFiles();
		for(int i = 0; i < flist.length ; i++) {
			File fileInfo = flist[i];
			String fileName = fileInfo.getName(); //파일이름 꺼내주는 함수
			long len = fileInfo.length(); // 파일의 사이즈 반환해주는 함수
			//출력
			System.out.println(fileName + " - " + len);
		}
		*/
		
		// 확장자가 .txt 인 것만 골라서 출력해보자.
		String[] list = dir.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				/*
				 	매개변수 설명
				 		File dir		- 현재 파일의 정보를 알려주고
				 		String name 	- 현재 파일의 이름만 알려준다.
				 		
				 		이 함수는 자동 호출함수이다.
				 		list() 함수가 호출될때 자동으로 호출되는 함수이다.
				 		목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다.
				 		반환값이 		true  이면 목록에 포함시키고
				 					false 이면 목록에서 제외시킨다.
				 */
				if(name.endsWith("txt")) {
					return true;
				}
				return false;
			}
			
		});
		
		//출력
		for(int i = 0; i < list.length ; i++) {
			String fileName = list[i];
			System.out.println(fileName);
		}
	}

	public static void main(String[] args) {
		new FileTest02();

	}

}
