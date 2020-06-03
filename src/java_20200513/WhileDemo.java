package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=10) {
			sum +=i;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		//구구단을 while문으로 작성
		
		i=2;
		/*int j=1;*/ //여기다가 선언하는 것이 아니다. 여기서 선언하면 2단 뿐만 나온다
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
				j++;
			}
			i++;
		}	
	}
}
