
public class Bautura extends Produs {

	private int concentratieAlcoolica;

	public Bautura(String denumire, double pret, int cantitate, int kcal, int concentratieAlcoolica) {
		super(denumire, pret, cantitate, kcal);
		this.concentratieAlcoolica = concentratieAlcoolica;
	}

	@Override
	public String toString() {
		return super.toString() + "Bautura [concentratieAlcoolica=" + concentratieAlcoolica + "]";
	}

	public int getConcentratieAlcoolica() {
		return concentratieAlcoolica;
	}

	public void setConcentratieAlcoolica(int concentratieAlcoolica) {
		this.concentratieAlcoolica = concentratieAlcoolica;
	}
	
}
