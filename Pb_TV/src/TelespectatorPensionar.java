
public class TelespectatorPensionar extends Telespectator {

	public TelespectatorPensionar(String nume, int varsta) {
		super(nume, varsta);
	
	}

	public void evalueazaEmisiunea(Emisiunea emisiune) {
		if(emisiune.getTip() == TipEmisiune.STIRI ||emisiune.getTip() == TipEmisiune.POLITICA) {
			System.out.println("ADOR!");
		}
		else 
			 System.out.println("NU imi place!");
	}
}
