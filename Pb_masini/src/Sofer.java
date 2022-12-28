public class Sofer {
 
	private String nume;
	private int nrPermis;
	
	public Sofer(String nume, int nrPermis) {
	
		this.nume = nume;
		this.nrPermis = nrPermis;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrPermis() {
		return nrPermis;
	}
	public void setNrPermis(int nrPermis) {
		this.nrPermis = nrPermis;
	}
	@Override
	public String toString() {
		return "Sofer [nume=" + nume + ", nrPermis=" + nrPermis + "]";
	}
	
	
}
