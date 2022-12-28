
public class TelespectatorCopil extends  Telespectator {

	public TelespectatorCopil(String nume, int varsta) {
		super(nume, varsta);
	}
	
	public void evalueazaEmisiunea(Emisiunea emisiune) {
		
		if(emisiune.getTipEmisiune().equals(Tip.DESENE)) {
			System.out.println("Imi place!");
		}
		else if (emisiune.getTipEmisiune().equals(Tip.STIRI)){
			System.out.println("Meh!");
		}
		else if (emisiune.getTipEmisiune().equals(Tip.POLITICA)) {
			System.out.println("Nu imi place!");
		}
		else if(emisiune.getDurata() <2) {
			System.out.println("Imi place!");
		}
		else {
			System.out.println("Nu imi place!");
		}
	}
}
