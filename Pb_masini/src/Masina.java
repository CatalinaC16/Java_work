import java.awt.Color;

public class Masina extends Autovehicul {
	
	public static final int nrUsi=4;	
	private String tipPortbagaj;
	
	
	public Masina(int viteza, int vitezaMaxima, int nrPasageri, String marca, int treaptaCurenta, int nrTrepte,
			Color culoare, String tipPortbagaj,Sofer sofer) {
		
		super(viteza, vitezaMaxima, nrPasageri, marca, treaptaCurenta, nrTrepte, culoare,sofer);
		this.tipPortbagaj = tipPortbagaj ;
	}
	
	@Override 
	protected void mesaj() {
		System.out.println("Acesta este o masina!!!");
	}
	public String toString() {
		return super.toString()+"\ntipPortbagaj=" + tipPortbagaj + "\nnrUsi="+nrUsi;
	}
	

	public String getTipPortbagaj() {
		return tipPortbagaj;
	}

	public void setTipPortbagaj(String tipPortbagaj) {
		this.tipPortbagaj = tipPortbagaj;
	}

	public static int getNrusi() {
		return nrUsi;
	}
}
