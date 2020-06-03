package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1 == s2); //false 
		System.out.println(s1.contentEquals(s2)); //true
	
		Customer c1 = new Customer("성영한","제주도");
		Customer c2 = new Customer("성영한","제주도");
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1); //Customer class에서 overriding 했음
		System.out.println(s1); //overriding 때문에 abc가 나오는 것
	}
}
