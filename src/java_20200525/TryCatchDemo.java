package java_20200525;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("예외 메세지 : "+e.getMessage());
			// System.err.println("2개 너!");
			e.printStackTrace(); // 에러가 어디서 생겼는지 등 다 알려주는 명령어

			/*
			 * 
			 * 일반 출력 : system.out 
			 * 에러 출력 : system.err
			 * 
			 */
			
		}catch(NumberFormatException e) {
			//System.err.println("예외 메세지 :"+e.getMessage());
			System.err.println("문자말고 숫자 너!");
		}finally {
			System.out.println("finally");
		}

		//catch 블럭이 여러 있을 경우 위에서 부터 하위 클래스 ==> 상위 클래스 순으로 정한다.
		
		
		
	}

}
