
public class Animal {
	private int id;
	private int anulNasterii;
	Hrana hrana;
	
	public Animal(int id, int anulNasterii,Hrana hrana) {
		this.id = id;
		this.anulNasterii = anulNasterii;
		this.hrana = new Hrana(hrana.cantitateHrana);
		cantitateHrana(hrana);
	}
	
	public void cantitateHrana(Hrana hrana) {
		double hr= 0.0;
		this.hrana.cantitateHrana = hr;
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", anulNasterii=" + anulNasterii + ", cantitateMancare="+" hrana=" + hrana + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnulNasterii() {
		return anulNasterii;
	}
	public void setAnulNasterii(int anulNasterii) {
		this.anulNasterii = anulNasterii;
	}

	
	

}
