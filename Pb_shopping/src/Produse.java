
public class Produse {

	private String nume;
	private int pret;
	private int stoc;
	TipProdus tipProdus;
	
	public Produse(String nume, int pret, int stoc, TipProdus tipProdus) {
		super();
		this.nume = nume;
		this.pret = pret;
		this.stoc = stoc;
		this.tipProdus = tipProdus;
	}

	@Override
	public String toString() {
		return "[nume=" + nume + ", pret=" + pret + ", stoc=" + stoc + ", tipProdus=" + tipProdus + "]";
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

	public TipProdus getTipProdus() {
		return tipProdus;
	}

	public void setTipProdus(TipProdus tipProdus) {
		this.tipProdus = tipProdus;
	}
	
	
}
