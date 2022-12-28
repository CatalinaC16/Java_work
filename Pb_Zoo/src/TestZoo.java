import java.awt.Color;

public class TestZoo {

	public static void main(String[] args) {
	

		Hrana h = new Hrana(0.0);
		Leu l1 = new Leu(35,2005,h, 300);
		Animal a2 = new Animal(33,2000,h);
		Caine c1 = new Caine(31,2003,h,"bischon");
		Pisica p1 = new Pisica(32,2003,h, Color.black);

		System.out.println(p1);
		System.out.println(l1);
		System.out.println(c1);
	}

}
