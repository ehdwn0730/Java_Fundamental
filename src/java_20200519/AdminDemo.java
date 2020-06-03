package java_20200519;

public class AdminDemo {
public static void main(String[] args) {
	
	Admin a = new Admin("syh1011","1111","syh@hbilab.org",1);  
	//==> 미리 설정하면 아래 setter를 쓸 필요가 없다 ==> Admin 클래스에 생성자 설정
	
	
	//a.id = "syh1011"; //private라서 접근 불가 ==> Admin class에 가서 setter 메서드 만듬
	//a.setId("syh1011");
	//a.setPwd("1111");
	//a.setEmail("syh@hbilab.org");
	//a.setLevel(1);
	
	
	//System.out.println(a.id) ===> Admin class에 가서 getter 메서드 만듬
	System.out.println(a.getId()); 
	System.out.println(a.getPwd());
	System.out.println(a.getEmail());
	System.out.println(a.getLevel());
	
	
	
	Admin a1 = new Admin("syh2022", "2222", "test@test.com");
	
	System.out.println(a.getId()); 
	System.out.println(a.getPwd());
	System.out.println(a.getEmail());
	System.out.println(a.getLevel());



}
}
