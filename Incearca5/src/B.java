import java.util.ArrayList;

class B extends A {
	ArrayList<String> arr = new ArrayList<String>();
	public B() {
		arr.add("eco");
		
		System.out.println(arr.contains("ecom"));
	}
	
public void myMethod() {
System.out.println("Iarna");
}
public static void main(String args[]) {
A obj = new B();
obj.myMethod();
}
}