package Java_20200520;

public class ShapeDemo {
	//추상 클래스의 다형성 ===> run 메소드를 더 간단히 한 것
	public static void run(Shape s) {
		s.draw();
	}

	/* run 메소드를 모두 오버라이딩 한 것
	
	public static void run(Triangle t) {
		t.draw();
	}

	public static void run(Circle c) {
		c.draw();
	}

	public static void run(Rectangle r) {
		r.draw();
	}
	
*/
	
	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없다.
		// Shape s1 = new Shape();

		Rectangle r1 = new Rectangle();
		run(r1);

		Circle c1 = new Circle();
		run(c1);

		Triangle t1 = new Triangle();
		run(t1);
	}
}
