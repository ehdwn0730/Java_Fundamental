package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStream in = System.in; // 표준 입력 장치와 연결(키보드)
		InputStreamReader isr = null; //1바이트를 2바이트로 바꾸기 위해
		BufferedReader br = null;
		try {

			// in.read(b) : 입력 받는 것을 기다림, 입력 받는 값이 1바이트는 아니기 때문에 위에 배열 생성
			// 키보드 입력중에 enter를 치면 키보드에 입력한 데이터를 b에 저장한다.
			/*
			 * byte[] b = new byte[100];
			 * System.out.print("입력하세요>");
			 * 
			 * int readByteCount = 0;
			 * 
			 * while ((readByteCount = in.read(b)) != -1) { String str = new String(b, 0,
			 * readByteCount); // ==> 입력받은 값을 문자열로 변환 System.out.println(str);
			 * System.out.print("입력하세요>"); }
			 */

			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			String readLine = null;
			System.out.println("입력하세요>");
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
