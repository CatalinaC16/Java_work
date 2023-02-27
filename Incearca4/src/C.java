public class C {
public static void main(String[] args) {
B a;
System.out.println(A.x);
a = new A();
B b = new B();
System.out.println(a.info());
System.out.println(b.info());
System.out.println(a.nume);
System.out.println(((A)a).nume);
System.out.println(b.nume);
System.out.println(B.x);
System.out.println(b instanceof A);
System.out.println(a instanceof B);
System.out.println(b.getClass().
getSuperclass().getName());
}
}