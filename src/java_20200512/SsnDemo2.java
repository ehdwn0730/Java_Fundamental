package java_20200512;

public class SsnDemo2 {
	public static void main(String[] args) {
		int a1 = 8;
		int a2 = 4;
		int a3 = 0;
		int a4 = 3;
		int a5 = 2;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 0;
		int b3 = 3;
		int b4 = 3;
		int b5 = 5;
		int b6 = 3;
		int b7 = 1;
		
		int sum = a1*2 + a2*3 + a3*4 + a4*5 + a5*6 + a6*7 +
				b1*8 + b2*9 + b3*2 + b4*3 + b5*4 + b6*5;
		
		int rest = sum % 11;
		
		rest = 11 - rest;
		rest %= 10;
		
		System.out.println(rest);
	}
}
