package java_20200519;

public class Parent {
	int money; //===> private를 사용하면 상속할 수 없다.

	public void makeMoney() {
		System.out.println("Parent makeMoney()");
	}

	public void play(String baduk) {
		System.out.println("Parent play()");
	}

}
