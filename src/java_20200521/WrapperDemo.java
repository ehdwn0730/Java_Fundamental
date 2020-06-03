package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {

		/*
		 * 
		 * 자바 1.4이전 버전에서는 primitive data type를 Collection에 저장할 수 없었기 때문에 primitive data
		 * type를 객체화 할 수 있는 Wrapper class가 필요함 아래와 같이 1을 추가할 수 없음. Collection에 1을 저장하기
		 * 위해서는 primitive data type를 객체화 하는 Integer 클래스로 변환해야 함.
		 * 
		 */

		/*
		 * int[] temp = { 1, 2, 3, 4 }; //reference에서는 더하기가 안된다. Integer i1 = new
		 * Integer(1); Integer i2 = new Integer(2); int i3 = i1.intValue() +
		 * i2.intValue(); // 이러면 더하기 가능
		 */

		ArrayList list = new ArrayList(); // 위에 import를 사용해야만 에러가 안난다.
		list.add(1); //auto-boxing 때문에 에러 안남
		list.add(new Integer(1)); // 그냥 add(1)일때는 에러가 나지만 new Integer(1) 해줘야 에러가 안난다.

		
		//1. primitive data type ==> wrapper class(new Integer(1))
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		//2. wrapper class ==> primitive data type(xxxValue())
		
		int i3 = i1.intValue() + i2.intValue();
		
		//3. String ==> primitive data type   *제일 많이 쓰니까 반드시 알고 있자
		
		String s1 = "10";
		String s2 = "20";
		
		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		System.out.println(i4);

		//4. primitive data type ==> String
		
		String s3 = 10+""; //쓰지말자
		String s4 = String.valueOf(10);
		
		
		//primitive data type 자동으로 wrapper class 변환하는 것을 
		// auto-boxing이라 한다.
		Integer i5 = 10;  //자바 5.0 부터는 auto-boxing으로 자동으로 변환
		Integer i6 = 20;
		
		//wrapper class가 자동으로 primitive data type으로 변환하는 것을
		// auto-unboxing이라 한다.
		int i7 = i5 + i6;
		
		System.out.println(i7);
		
		
		
		
	}
}
