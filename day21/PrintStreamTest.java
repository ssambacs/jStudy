package day21;

import java.io.PrintStream;

/*
ps.println(- Hortense Vlou -@
ps.println(@
ps.println(Desert@
ps.println(@
ps.println(He felt so lonely@
ps.println(In this desert@
ps.println(That sometimes@
ps.println(He would walk backwards@
ps.println(Just to see tracks in front of him.@

�� �ø� �����غ���
PrintStream�� ����ؼ� ó������.
 */
public class PrintStreamTest {

	public PrintStreamTest() {
		//��Ʈ���� �غ��Ѵ�.
		// PrintStream�� ���Ͱ迭 ��Ʈ���������� ��ġ�� ���� �����ؼ� ����ϴ� ��Ʈ���̴�.
		PrintStream ps = null;
		try {
			ps= new PrintStream("src/day21/data/desert.txt");
			
			// ���� ���Ͽ� ����� ��Ʈ���� ����� ������Ʈ���̴�.
			ps.println("- Hortense Vlou -");
			ps.println("");
			ps.println("Desert");
			ps.println("");
			ps.println("He felt so lonely");
			ps.println("In this desert");
			ps.println("That sometimes");
			ps.println("He would walk backwards");
			ps.println("Just to see tracks in front of him.");
			
			ps.flush();
			// ����������  Buffered�� ����� ������ �����Ƿ�
			// �ݵ�� �������Ⱑ �������� ���۸� ����� �Ѵ�.
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				/*
				 	close() �� ��ɿ���
				 	���������� flush() ����� �����ϰ� �ְ�
				 	���� close() �Լ��� ȣ���ϸ�
				 	�ڵ������� flush()�� �ȴ�
				 */
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PrintStreamTest();
	}

}
