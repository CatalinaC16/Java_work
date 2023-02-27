import java.util.Arrays;
public class MyClass extends Class {

	int[] vec = new int[2];
	
	 
	
	public MyClass(int z) {
		super(z);
		vec[0]=5;
		vec[1]=6;
			
		System.out.print(Arrays.toString(vec));
		// TODO Auto-generated constructor stub
	}
	public void go() {
		System.out.println("GOO");
	}


}
