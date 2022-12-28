
public class Mancare extends Produs{

	private int gramaj;

	public Mancare(String denumire, double pret, int cantitate, int kcal, int gramaj) {
		super(denumire, pret, cantitate, kcal);
		this.gramaj = gramaj;
	}

	public int getGramaj() {
		return gramaj;
	}

	public void setGramaj(int gramaj) {
		this.gramaj = gramaj;
	}

	@Override
	public String toString() {
		return super.toString() + " Mancare [gramaj=" + gramaj + "]";
	}
	
}
