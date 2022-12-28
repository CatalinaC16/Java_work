
public class Client {

	private String nume;
	private int varsta;
	private int buget;
	
	public Client(String nume, int varsta, int buget) {
		this.nume = nume;
		this.varsta = varsta;
		this.buget = buget;
	}

	public void cumparaprodus(Produse produs) {
		System.out.println("Clientul "+this.toString()+"doreste sa cumpere produsul "+ produs.toString());
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + ", buget=" + buget + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getBuget() {
		return buget;
	}

	public void setBuget(int buget) {
		this.buget = buget;
	}
	
	
}
