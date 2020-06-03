package java_20200514;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "watermelon", "blueberry" };

		String[] temp = new String[6];
		// fruits => 원본 배열
		// 0 ==> 원본배열의 위치
		// temp ==> 복사할 배열
		// 2 ==> 복사할 배열의 위치
		// 4 ==> 원본배열의 4개 요소를 복사
		System.arraycopy(fruits, 0, temp, 2, 4);
	
	
		temp[0] = "peach";
		temp[1] = "peer";
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		for(String value : temp) {
		    System.out.println(value);
		}
		
		
		
		
		
		
	}
}
