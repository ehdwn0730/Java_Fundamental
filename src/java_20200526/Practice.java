package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
public static void main(String[] args) {
	/*FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
		fos = new FileOutputStream("c:\\dev\\Git1");
		
		int readByte = 0;
		while ((readByte = fis.read()) != -1) {
			fos.write(readByte);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
*/
/*

	FileInputStream fis1 = null;
	FileOutputStream fos1 = null;
	
	try {
		fis1 = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
		fos1 = new FileOutputStream("c:\\dev\\Git2");
		
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		
		while((readByteCount = fis1.read(readBytes)) != -1) {
			fos1.write(readBytes, 0, readByteCount);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
			try {
				if(fis1 != null) fis1.close();
				if(fos1 != null) fos1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

*/
	
	
	FileInputStream fis2 = null;
	FileOutputStream fos2 = null;
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		fis2 = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
		fos2 = new FileOutputStream("c:\\dev\\Git3");
		bis = new BufferedInputStream(fis2, 1024);
		bos = new BufferedOutputStream(fos2);
		
		int readByte = 0;
		while((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		
		bos.flush();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
			try {
				if(fis2 != null) fis2.close();
				if(fos2 != null) fos2.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	

}
}
