import java.awt.Color;

public class TestDrive {

	public static void main(String[] args) {
		
	    Sofer s1= new Sofer("Nicu",154);
		Masina m1 = new Masina(50, 120, 4, "Ford", 3,5, Color.blue,"spate",s1);
		System.out.println(m1);
		m1.mesaj();
		System.out.println("\n");
		Autobuz a1= new Autobuz(50,100,23,"VW",4,6,Color.yellow,s1);
		System.out.println(a1);
		System.out.println("\n");
		a1.decelerare(20);
		m1.accelerare(20);
		System.out.println(a1.getViteza()+" bus si masina cu "+m1.getViteza());
		m1.setNrPasageri(6);
		System.out.println(m1);
		
				

	}

}
