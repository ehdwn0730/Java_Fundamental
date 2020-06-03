package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	//디폴트 생성자(default constructor) ===> 클래스 내에 생성자가 없으면 자동으로 만들어 짐
	//단축키 ==> Alt + Shift + s => c
	public Admin() {
		super();//부모 클래스의 디폴트 생성자를 호출
	}
	
	//생성자(Constructor)
	//생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	//생성자의 역할은 인스턴스 변수 초기화
	//단축키 ==> Alt + Shift + s => o
	public /*void ==> void 함수가 되는 거*/ Admin(String id, String pwd, String email, int level) {
		super(); //부모 클래스의 디폴트 생성자를 호출
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	//생성자의 오버로딩
	public Admin(String id, String pwd, String email) {
		//super();
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		
		this(id, pwd, email, 0);  //다른 생성자를 호출할 때 쓰는 this, 반드시 생성자에서만 호출 가능
		//this 용법 2가지
		//1. 자기자신 객체 => this.
		//2. 다른 생성자를 호출 => this(~,~,,,,,)
	}
	
	
	
	//id에 대한 setter 메서드
	public void setId(String id) {
		this.id = id;
	}
	//id에 대한 getter 메서드
	public String getId() {
		return id;
	}

	//pwd에 대한 setter 메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//pwd에 대한 getter 메서드
	public String getPwd() {
		return pwd;
	}

	//email에 대한 setter 메서드
	public void setEmail(String email) {
		this.email = email;
	}
	//email에 대한 getter 메서드
	public String getEmail() {
		return email;
	}
	
	//level에 대한 setter 메서드
	public void setLevel(int level) {
		this.level = level;
	}
	//level에 대한 getter 메서드
	public int getLevel() {
		return level;
	}
	
	

}
