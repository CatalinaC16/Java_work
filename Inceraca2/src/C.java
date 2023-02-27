
public class C {

	public static void main(String[] args) {
	
		System.out.println(A.y=="POO");
		B b = new B(100);
		System.out.println(A.y);
		A a = new B(100);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(a.method());
		System.out.println(b.method());
		System.out.println(a.getClass().getName());
		A obj = new A(100);
		System.out.println(obj instanceof B);
	}

}
