
public class Emisiunea {

	private String nume;
	private int durata;
	TipEmisiune tip;
	
	
	public Emisiunea(String nume, int durata, TipEmisiune tip) {
		this.nume = nume;
		this.durata = durata;
		this.tip = tip;
	}


	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public TipEmisiune getTip() {
		return tip;
	}


	public void setTip(TipEmisiune tip) {
		this.tip = tip;
	}


	@Override
	public String toString() {
		return "Emisiunea [nume=" + nume + ", durata=" + durata + ", tip=" + tip + "]";
	}
	
}
