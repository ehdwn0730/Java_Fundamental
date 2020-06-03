package Java_20200520;

public class SubDemo2 {
	public static void change(Super sup) { //Super sup = s1;
		sup.age = 20;
		sup.playBadook();
		sup.work(); //자식의 Sub work() 호출 ==> overriding 메서드는 자식 메서드가 호출
	
		}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);
		s1.playGame();
		
		change(s1);

		System.out.println(s1.age);
	}
}
