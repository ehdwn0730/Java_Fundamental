package java_20200514;

public class TwoArrayDemo1 {
public static void main(String[] args) {
	
	//배열 선언 및 생성
	int[][] a = new int[2][2];
	
	//배열 할당
	a[0][0] = 1;
	a[0][1] = 2;
	a[1][0] = 3;
	a[1][1] = 4;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[i][j]);
			
		}
		
		
		
		
	}
}
}
