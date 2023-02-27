
public class Produs {

	private String nume;
	private double pret;
	private int stoc;
	private TipProdus tip;
	
	public Produs(String nume, double pret, int stoc, TipProdus tip) {
		super();
		this.nume = nume;
		this.pret = pret;
		this.stoc = stoc;
		this.tip = tip;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public int getStoc() {
		return stoc;
	}
	public void setStoc(int stoc) {
		this.stoc = stoc;
	}
	public TipProdus getTip() {
		return tip;
	}
	public void setTip(TipProdus tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Produs [nume=" + nume + ", pret=" + pret + ", stoc=" + stoc + ", tip=" + tip + "]";
	}
	
	
}
