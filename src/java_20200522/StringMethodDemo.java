package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-1111110";
		// charAt(int index) : 문자열 중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd"); // == ssn +"abcd"
		System.out.println(ssn);

		// endsWith(String msg) : msg문자열로 끝나면 true, 그렇지 않은면 false
		String fileName = "abcd.doc";
		if (fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		} else {
			System.out.println("파일 입니다.");
		}

		// startsWith(String msg) : msg 문자열로 시작하면 true, 그렇지 않으면 false
		String url = "http://www.naver.com";
		String path = "/news/ssss.do?id=123";
		if (path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		} else if (path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		} else {
			System.out.println("페이지가 존재하지 않습니다.");
		}

		// equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true, 그렇지 않으면
		// false
		boolean success = fileName.equalsIgnoreCase("abcd.doc");
		System.out.println(success);

		// indexOf(String msg) : msg 문자열의 위치를 반환
		int index = ssn.indexOf("-");
		System.out.println(index);

		// lastIndexOf(String msg) : msg 문자열의 위치를 마지막에서 시작하여 찾고 index는 처음부터 msg 문자열까지
		// index를 반환.
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));

		// 배열의 길이 : length, 문자열의 길이 : length()
		// trim() = 앞 뒤 문자열의 공백 제거
		String dbId = "syh1011".trim();
		String userId = "syh1011 ".trim();
		System.out.println(dbId.equals(userId));

		// substring(int first, int last)
		// first(포함)부터 second(포함하지 않음) 사이의 문자열을 추출
		// substring(int first)
		// first(포함) 보다 큰 모든 문자열을 추출
		fileName = "abc.doc";
		String first = fileName.substring(0, fileName.indexOf(".")); // fileName.indexOf를 이용하면 아무리 파일명이 바뀌어도 괜찮다.
		String last = fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(first);
		System.out.println(last);

		// replaceAll(String first, String second)
		// first 문자열을 second 문자열로 대체
		String html = "안녕하세요\n저는 성영한 입니다.\n잘 부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);

		// toUpperCase() : 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();

		System.out.println(m1);

		// toLowerCase() : 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1.toString());

		// String.valueOf(~) : primitive data type를 문자열로 변환
		char[] c1 = { 'a', 'b', 'c' };
		String msg = String.valueOf(true); // ==> "true"

		System.out.println(msg);

		String[] str = ssn.split("-");
		String ssn1 = str[0];
		String ssn2 = str[1];

		System.out.println(ssn1);
		System.out.println(ssn2);

		
		
		String str2 = String.format("%,.2f", 123123.4567);
		System.out.println(str2);
		
		
		str2 = String.format("%3$,20.2f %2$,20.2f %1$,20.2f", 1234.4590, 123345.5680, 34234.5690);
		System.out.println(str2);
		
		
		
		
		
		
		
		
	}
}
