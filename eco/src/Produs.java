
public class Produs {

	private String denumire;
	private double pret;
	private int cantitate;
	private int kcal;
	
	
	public Produs(String denumire, double pret, int cantitate, int kcal) {
		this.denumire = denumire;
		this.pret = pret;
		this.cantitate = cantitate;
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return "Produs [denumire=" + denumire + ", pret=" + pret + ", cantitate=" + cantitate + ", kcal=" + kcal + "] ";
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
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
}
