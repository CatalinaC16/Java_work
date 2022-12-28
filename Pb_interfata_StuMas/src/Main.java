import java.awt.Color;

public class Main {

	public static void main(String[] args) {
	
		Masina m1 = new Masina("vw",Color.white);
		Student s1 = new Student("Cio","Cata",m1);
		Student s2 = null;
		  try {
	          	 
	            s2 = (Student) s1.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
		  
		System.out.println(s1.getNume());
		s2.setNume("Ciochina");
		System.out.println(s1.getNume());
		System.out.println(s2.getNume());
		
		

	}

}
