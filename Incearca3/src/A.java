public class A {
private String mesaj;
private static int valoare;
private double numar = 10;
{
mesaj="98";
}
public A() {
this(2);
valoare*=5;
}
public A(int x) {
mesaj+=x;
valoare+=x;
}
public void modifica(A obj, int valoare) {
obj = new A();
obj.mesaj="TEST";
valoare++;
numar--;
}
public static void main(String[] args) {
A x = new A();
A y = new A(2);
System.out.println(x.mesaj);

System.out.println(x.mesaj!=y.mesaj);
System.out.println(x.mesaj.equals(y.mesaj));
A z = x;
System.out.println(x!=z);
int w = 500;
x.modifica(y, w);
System.out.println(y.mesaj.equals("TEST"));
System.out.println(w);
System.out.println(x.numar+y.numar);
A[] t = new A[2];
System.out.println(A.valoare);
System.out.println(A.valoare==y.valoare);
System.out.println(-30>>>30);
}
}