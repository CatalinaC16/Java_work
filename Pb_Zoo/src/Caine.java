
public class Caine extends Animal{
	private String rasa;
	
	public Caine(int id, int anulNasterii, Hrana hrana, String rasa) {
		super(id, anulNasterii, hrana);
		this.rasa = rasa;
		//cantitateHrana(hrana);
	}
	public void cantitateHrana(Hrana hrana) {
		double hr= 0.5;
		this.hrana.cantitateHrana = hr;
	}
	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	@Override
	public String toString() {
		return super.toString()+"Caine [rasa=" + rasa + "]";
	}
	
	
}
