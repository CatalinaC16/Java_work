
public class Pasager {

	private String nume;
	private int varsta;
	
	public Pasager(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
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

	@Override
	public String toString() {
		return "Pasager [nume=" + nume + ", varsta=" + varsta + "]";
	}
	
}
