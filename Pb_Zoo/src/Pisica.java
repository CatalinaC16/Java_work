import java.awt.Color;

public class Pisica extends Animal{

	private Color culoareBlana;
	

	public Pisica(int id, int anulNasterii, Hrana hrana, Color culoareBlana) {
		super(id, anulNasterii, hrana);
		this.culoareBlana = culoareBlana;
		//cantitateHrana(hrana);
	}
	
	public void cantitateHrana(Hrana hrana) {
		double hr= 0.3;
		this.hrana.cantitateHrana = hr;
	}

	@Override
	public String toString() {
		return super.toString()+"Pisica [culoareBlana=" + culoareBlana + "]";
	}

	public Color getCuloareBlana() {
		return culoareBlana;
	}

	public void setCuloareBlana(Color culoareBlana) {
		this.culoareBlana = culoareBlana;
	}
	
}
