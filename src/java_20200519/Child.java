package java_20200519;

public class Child extends Parent{
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	
	public void play(String starcraft) {
		//super.play(starcraft); //둘다 놀겠다 라는 개념
		System.out.println("Child play()");
	}
	
	
	public void setParentMoney(int money) {
		/*this.money = money;*/ //자신의 클래스에 있는 money
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}
}
