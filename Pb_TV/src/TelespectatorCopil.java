
public class TelespectatorCopil extends Telespectator {

	public TelespectatorCopil(String nume, int varsta) {
		super(nume, varsta);
		
	}

	public void evalueazaEmisiunea(Emisiunea emisiune) {
		if(emisiune.getTip() == TipEmisiune.DESENE) {
			System.out.println("Imi place!");
		}
		else if(emisiune.getTip() == TipEmisiune.STIRI) {
			System.out.println("Meh!");
		}
		else if(emisiune.getTip() == TipEmisiune.POLITICA) {
			System.out.println("NU imi place”!");
		}
		else if(emisiune.getTip() == TipEmisiune.STIRI) {
			
			if(emisiune.getDurata()<2) System.out.println("Imi place!");
			else System.out.println("NU imi place!");
		}
	}
}