package java_20200512;

//Ctrl + shift + f ==> 자동으로 줄 맞춰주기
public class OperatorDemo {
		public static void main(String[] args) {
			int a = 10, b = 22;
			int c = 0;
			double d = 0;

			c = a + b;
			System.out.println(c);

			c = a - b;
			System.out.println(c);

			d = b / a; // int때문에 소수점 이하를 없어버리지만 double d 이므로 2.0으로 나온다
			System.out.println(d);

			d = (double) b / a;
			System.out.println(d);

			c = a * b;
			System.out.println(c);

			// 나머지 연산자
			c = b % a;
			System.out.println(c);

			a += b; // a = a+b;
			System.out.println(a);

			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i; // sum = sum +i; ===> 햐수 냄새 나는 표현
			}
			System.out.println(sum);

			a = 10;
			b = 20;

			c = a++; // a = a+1;
			System.out.println(c);

			d = ++b; // b = b+1;

			System.out.println(c);
			System.out.println(d);

			// 대입 후 증가
			c = a++; // c => 11
			System.out.println(c);

			// 증가 후 대입
			c = ++b; // c => 22
			System.out.println(c);

			a = 10;
			b = 20;

			boolean inSuccess = false;
			inSuccess = a > b;
			System.out.println(inSuccess);

			inSuccess = a < b;
			System.out.println(inSuccess);

			inSuccess = a >= b;
			System.out.println(inSuccess);

			inSuccess = a <= b;
			System.out.println(inSuccess);
			// primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면 true를 반환한다.
			inSuccess = a == b;
			System.out.println(inSuccess);

			inSuccess = a != b;
			System.out.println(inSuccess);

			System.out.println(4 & 5);
			System.out.println(4 | 5);
			System.out.println(4 ^ 5);
			
			a = 10;
			b = 20;
			
			// a && b => a가 false이면 b를 연산하지 않음(short circuit)
			// a || b => a가 true이면 b를 연산하지 않음(short circuit)
			
			inSuccess = (a==b) && (++a==b++);
			System.out.println(inSuccess);
			System.out.println(a);
			System.out.println(b);
		
		
			// + => 연결연산자 (두 개중 1개 이상이 문자열일 경우), 산술연산자(두개 모두 숫자일경우)
			
			System.out.println(1+2+3+"456");
			System.out.println("123"+4+5+6);
		
		}
	}
