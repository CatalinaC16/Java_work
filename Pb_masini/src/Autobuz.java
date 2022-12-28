import java.awt.Color;

public class Autobuz extends Autovehicul{

	public static final int nrUsi=2;
	
	public Autobuz(int viteza, int vitezaMaxima, int nrPasageri, String marca, int treaptaCurenta, int nrTrepte,
			Color culoare,Sofer sofer) {
		super(viteza, vitezaMaxima, nrPasageri, marca, treaptaCurenta, nrTrepte, culoare,sofer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mesaj() {
		System.out.println("Acesta este o autobuz!!!");
	}
	public String toString() {
		return super.toString()+ "\nnrUsi="+nrUsi;
	}


}
