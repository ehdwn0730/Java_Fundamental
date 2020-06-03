package java_20200514;

public class ArrayCopyDemo1 {
public static void main(String[] args) {
	String[] fruits = {"a","b","c","d"};
	
	String[] temp = new String[5];
	
	System.arraycopy(fruits, 0, temp, 2, 2);
	
	for(String value : temp) {
	    System.out.println(value);
	}
	
	
}
}
