package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			/*if(i !=6) {
			sum += i;   이렇게라도 할 수가 있다.
			}*/ 

			if(i==6) continue;  //continue를 만나면 아래 명령어 수행이 아니라 다시 조건절로 가서 수행
			sum += i;
		
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.(단 6은 제외한다.)%n", sum);
		
		
		outter : for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j==5) continue outter;
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
	}
}
