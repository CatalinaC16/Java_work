
public class Bilet {

	protected int numarBilet;
	protected int pret;
		
	public Bilet(int numarBilet, int pret) {
		
		this.numarBilet = numarBilet;
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Bilet [numarBilet=" + numarBilet + ", pret=" + pret + "]";
	}
	
	public int getNumarBilet() {
		return numarBilet;
	}
	public void setNumarBilet(int numarBilet) {
		this.numarBilet = numarBilet;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
}
