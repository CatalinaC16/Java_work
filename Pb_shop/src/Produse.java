
public class Produse {

	private String nume;
	private int pret;
	private int stoc;
	private Tip tipProdus;
	
	public Produse(String nume, int pret, int stoc, Tip tipProdus) {
		this.nume = nume;
		this.pret = pret;
		this.stoc = stoc;
		this.tipProdus = tipProdus;
	}
	

	@Override
	public String toString() {
		return "Produs [nume=" + nume + ", pret=" + pret + ", stoc=" + stoc + ", tipProdus=" + tipProdus + "]";
	}


	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public int getStoc() {
		return stoc;
	}

	public void setStoc(int stoc) {
		this.stoc = stoc;
	}

	public Tip getTipProdus() {
		return tipProdus;
	}

	public void setTipProdus(Tip tipProdus) {
		this.tipProdus = tipProdus;
	}
	
	
	
	
}
