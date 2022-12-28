package pb6_1;

public class Zi {

	private String nume;
	private boolean lucratoare;
	
	public Zi(String nume, boolean lucratoare) {
		super();
		this.nume = nume;
		this.lucratoare = lucratoare;
	}
	
	@Override
	public String toString() {
		return "Zi [nume=" + nume + ", lucratoare=" + lucratoare + "]";
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public boolean isLucratoare() {
		return lucratoare;
	}
	public void setLucratoare(boolean lucratoare) {
		this.lucratoare = true;
	}
	public void setNeLucratoare(boolean lucratoare) {
		this.lucratoare = false;
	}
}
