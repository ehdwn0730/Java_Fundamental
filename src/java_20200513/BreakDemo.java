package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;  //break는 반복문을 빠져나갈때 쓰는 것, while문에서 많이 씀
			sum += i;
		}
		System.out.printf("1부터 5까지 합은 %d 입니다. %n", sum);
		
		outter : for (int i = 2; i <= 9; i++) {  //outter : ===> 레이블 설정
			for (int j = 1; j <= 9; j++) {
				if(i ==5 && j ==6) break outter; //두번제 for문에만 빠져나가게 됨, outter라는 레이블은 쓸 수 있다.
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
	}
}
