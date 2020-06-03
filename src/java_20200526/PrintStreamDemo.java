package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

		public static void main(String[] args) {
			
			PrintStream monitor = System.out;  //출력 장치와 연결된 PrintStream
			//monitor.print(); //print에는 매개변수가 없는 것은 사용할 수 없다.
			monitor.println("Hello World!");
			System.out.println("Hello World!");
			//System.err.println("Hello World!"); // err.print는 catch 블록에서 에러 출력 하기 위해서 사용
			
			
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			PrintStream ps = null;
			
			try {
				fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
				bis = new BufferedInputStream(fis);
				fos = new FileOutputStream("c:\\dev\\git1.exe");
				bos = new BufferedOutputStream(fos);
				ps = new PrintStream(bos, true); //true ==> autoFlush
				
				int readByte = 0;
				while((readByte = bis.read()) != -1) {
					//ps.print(readByte); //buffer 기능이 없음.
					ps.write(readByte); //buffer 기능을 갖고 있음
				}
				
				// flush() 안해도 됨...
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(ps != null) ps.close();
					try {
						if(fis != null)	fis.close();
						if(bis != null)	bis.close();
						if(fos != null)	fos.close();
						if(bos != null)	bos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
	}
	

