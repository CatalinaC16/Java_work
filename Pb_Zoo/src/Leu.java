
public class Leu extends Animal {

	private int greutate;

		
	public Leu(int id, int anulNasterii, Hrana hrana, int greutate) {
		super(id, anulNasterii, hrana);
		this.greutate = greutate;
		cantitateHrana(hrana);
	}
	
	public void cantitateHrana(Hrana hrana) {
		double hr= 2.0;
		hr = hr + 0.01*(double)greutate;
		this.hrana.cantitateHrana = hr ;
	}
	
	public int getGreutate() {
		return greutate;
	}

	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}

	@Override
	public String toString() {
		return super.toString()+"Leu [greutate=" + greutate + "]";
	}


}
