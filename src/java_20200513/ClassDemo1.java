package java_20200513;

public class ClassDemo1 {
public static void main(String[] args) {
	int sum = 0;
	for(int i=1; i<=10; i++) {
		sum+=i;
	}
	System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
	System.out.println("1부터 10까지 합은 %d 입니다.");

		sum = 0;
		for(int i =0; i<=10; i++) {
			if(i%2 == 0) {
				sum+=i;
			}
		}
		System.out.printf("1부터 10까지 짝수합은 %d 입니다.%n", sum);
		
		
		for(int i=2; i<=9; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
		for (int i = 9; i > 1; i--) {
			for (int j = 9; j > 0; j--) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
			
		}
}
}
