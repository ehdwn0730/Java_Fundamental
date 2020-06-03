package java_20200512;

public class CastingDemo {
public static void main(String[] args) {
	//byte 범위를 넘어가면 에러 발생
			//형변환을 하면 에러가 발생하지 않고, circuit 발생 ===> circuit는 byte(자료형)의 범위내에서 순환
			byte a = (byte)129;
			System.out.println(a);

			//float, double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림
			//cut 발생
			int b = (int)42.5; //42.5 ===> double,  int ==> 정수형
			System.out.println(b);
}
}
