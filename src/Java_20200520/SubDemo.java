package Java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work(); //??
		
		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();
		
		
		Super s3 = new Sub(); // age = 50이 나온다
		
		//Super s3 = s2;  //age = 20이 나온다 ==> s3 앞에 super 이므로 아무르 s2가 sub지만 super에 속하는 변수만 나온다
		System.out.println(s3.age);
		s3.playBadook();
		s3.work(); // 오버라이징 된 자식 메소드만 사용가능
		
		//s3.height = 20; //자식 메소드를 사용할 수 없다
		
	}

}
