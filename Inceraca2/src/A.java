
public class A {
	
	static String y = "POO";
	int x= 20;
	public A(int x) {
		y+="Sesiune";
		x=25;
		
	}
	boolean equals(A obj) {
		return x==obj.x;
		
	}
	public int method() {
		return 2*x;
	}
	

}
