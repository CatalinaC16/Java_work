public class C {
public static void main(String[] args) {
A obj = new B();
System.out.println(obj instanceof A);
System.out.println(obj instanceof B);
System.out.println(obj.getClass(). getSuperclass().getName());
obj.display();
((A)obj).display();
System.out.println(obj.getPlusX());
System.out.println(((A)obj).getPlusX());
System.out.println(((B)obj).getY());
System.out.println(obj.x);
System.out.println(((B)obj).x);
}
}