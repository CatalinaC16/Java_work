public class C {
private A a;
private B b;
public C() {
a = new A();
b = a;
}
public static void main(String[] args) {
C obj = new C();
System.out.println(obj.a.valoare);
System.out.println(obj.b.valoare);
System.out.println(obj.a.nume);
System.out.println(obj.b.nume);
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.a instanceof B);
System.out.println(obj.b instanceof A);
System.out.println(obj.b.getClass(). getName());
System.out.println(A.info);
}
}