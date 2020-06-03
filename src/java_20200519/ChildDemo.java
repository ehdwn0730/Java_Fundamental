package java_20200519;

public class ChildDemo {
public static void main(String[] args) {
	Parent p = new Parent();
	p.money = 1_000_000_000;
	p.makeMoney();
	p.play("baduk");
	
	System.out.println(p.money);
	
	
	Child c = new Child();
	c.money = 1_000_000_000; //자식 클래스에는 money가 없지만 부모 클래스에 있기 때문에 사용가능
	c.setParentMoney(1_000_000);
	c.chicken = "교촌통닭";
	c.gotoSchool();
	c.makeMoney(); //자식 클래스에는 money가 없지만 부모 클래스에 있기 때문에 사용가능
	c.play("omok");
	
	System.out.println(c.money);
	System.out.println(c.getParentMoney());
	System.out.println(c.chicken);
	
	

}
}
