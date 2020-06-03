package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//Ctrl + Shift + o(영문자) ==> 자동 import
		//HashSet 객체의 중복을 허용하지 않고, 순서도 없음
		
		//1. 선언 및 생성
		HashSet set = new HashSet();
		
		//2. 할당
		set.add(1);  //primitive를 자동적으로 wrapper로 boxing ==> auto boxing
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(5);
		
		System.out.println(set.size()); //set size는 4이다 이유 : 중복은 허용 X
		
		//3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}
		
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("성영한1"));
		set1.add(new Customer("성영한2"));
		set1.add(new Customer("성영한3"));
		set1.add(new Customer("성영한1"));
		
		System.out.println(" size : "+set1.size()); 
		//overriding 안했기 때문에 사이즈 4이다.		
		//Customer 클래스에 overriding 했으므로 사이즈 3
	
	
		//로또 복권 - HashSet(출력 순서가 랜덤)
		
		//TreeSet - 객체의 중복 허용 X , 오름차순 정렬
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45) +1;
			lotto.add(random);
			if(lotto.size() ==6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + "\t");
		}
	
	
	}
}
