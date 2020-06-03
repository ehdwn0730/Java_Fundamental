package java_20200514;

public class ArrayDemo1 {
	public static void main(String[] args) {
	//배열 선언, 생성, 할당
		int[]a = new int[2];
		a[0] = 1;
		a[1] = 2;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int []b = {10, 20, 30};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//배열 값 변경
		b[0] = 11;
		b[1] = 12;
		b[2] = 13;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//배열 출력 (enhanced for loop)
		for(int value : b) {
			System.out.println(value);
		}
		
	
		int[]c = a;
		System.out.println(c[0]);
	
		c[0] = 15;
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		
		
		//배열이 아닌 그냥 일때  a1 = 20으로 바뀌지만 b1 = 그대로 10이다
		// reference가 아닌 primitive 이므로
		int a1 = 10;
		int b1 = a1;
		
		a1 = 20;
		
	}
}
