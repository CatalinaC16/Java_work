
public class Emisiunea {

	private String nume;
	private int durata;
	private Tip tipEmisiune;
	
	public Emisiunea(String nume, int durata, Tip tipEmisiune) {
		this.nume = nume;
		this.durata = durata;
		this.tipEmisiune = tipEmisiune;
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

	public Tip getTipEmisiune() {
		return tipEmisiune;
	}

	public void setTipEmisiune(Tip tipEmisiune) {
		this.tipEmisiune = tipEmisiune;
	}

	@Override
	public String toString() {
		return "Emisiunea [nume=" + nume + ", durata=" + durata + ", tipEmisiune=" + tipEmisiune + "]";
	}
	
}
