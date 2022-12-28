
public class Telespectator {

	private String nume;
	private int varsta;
	
	public Telespectator(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	
	public void evalueazaEmisiunea(Emisiunea emisiune) {
		System.out.println("Telespectatorul"+this.toString() +"nu stie ce sa spuna despre emisiunea" + emisiune.toString());
	}
	
	@Override
	public String toString() {
		return "Telespectator [nume=" + nume + ", varsta=" + varsta + "]";
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
	
	
	
}
