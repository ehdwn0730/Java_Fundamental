package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		
		//File 클래스
		//1. 디렉토리 생성(v)
		//2. 파일 크기(v), 파일 이름, 파일 경로, 날짜
		//3. 파일 생성, 삭제(v)
		//4. 파일 이름 바꾸기(v)
		
		
		
		// 자동적으로 폴더를 생성한다. 디렉토리가 없을 시
		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		
		//파일 사이즈를 출력 가능
		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length()/1024;  //그냥 length는 byte로 나온다.
		System.out.println(fileSize+"KB");
		
		//파일 이름 출력
		String fileName = f2.getName();
		System.out.println(fileName);
		
		//파일 전체 경로 출력
		String path = f2.getPath();
		System.out.println(path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		}else if(fileName.endsWith("pdf")) {			
			System.out.println("pdf 파일");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		
		//1970년 1월 1일 부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환
		//1589168830389 ==> 년 월 일 로 변환시켜보기(구글링을 통해) ==> calendardemo 클래스에서
		long lastModified = f2.lastModified();
		System.out.println(lastModified);
			
		Calendar c = Calendar.getInstance(); 
			//getInstance ==> 플레이어는 각자 다른 객체로 생성되지만 사용하는 데이터 정보는 항상 같아야 할때
			c.setTimeInMillis(lastModified);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			
			String date = sdf.format(c.getTime());
			System.out.println(date);
			
			
		//해당 경로에 파일 생성	
		File f3 = new File("C:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
	
		//해당 경로 파일 지우기
		//f3.delete();
		
		//파일 이름 바꾸기
		File f4 = new File("C:\\dev\\HelloWorld.java");
		f3.renameTo(f4);   //f3파일을 f4 파일 이름으로 바꾸겠다
	
		
		
		
		
		
		
		
	}
}
