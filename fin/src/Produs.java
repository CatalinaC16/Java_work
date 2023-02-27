
public class Produs {

	private int codProdus;
	private String denumire;
	private double pret;
	private boolean glutenFree;
	
	public Produs(int codProdus, String denumire, double pret, boolean glutenFree) {
		super();
		this.codProdus = codProdus;
		this.denumire = denumire;
		this.pret = pret;
		this.glutenFree = glutenFree;
	}

	public int getCodProdus() {
		return codProdus;
	}

	public void setCodProdus(int codProdus) {
		this.codProdus = codProdus;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	@Override
	public String toString() {
		return "Produs [codProdus=" + codProdus + ", denumire=" + denumire + ", pret=" + pret + ", glutenFree="
				+ glutenFree + "]";
	}
	
	
	
}
