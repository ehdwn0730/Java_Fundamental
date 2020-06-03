package java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}
}

class A extends Object{
	A(int a){//이게 있으면 에러가 생김, default 값이 없기때문
		super();
	}
	A(){//default를 만들어 줘야 에러가 안생김
		super();
	}
}

class B extends A{//부모 a 클래스로 올라 갔을 때 default 값이 없기 때문에 에러
	B(){
		super();
	}
}








/* 위에 있는 거랑 똑같은 거지만 자동적으로 안보이기 때문
class A extends Object {
	A() {
		super();
	}
}

class B extends A {
	B() {
		super();
	}
}
*/