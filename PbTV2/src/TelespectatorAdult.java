
public class TelespectatorAdult extends  Telespectator {

	public TelespectatorAdult(String nume, int varsta) {
		super(nume, varsta);
	}

	
	public void evalueazaEmisiunea(Emisiunea emisiune) {
		
		if(emisiune.getTipEmisiune().equals(Tip.STIRI)||emisiune.getTipEmisiune().equals(Tip.SPORT)) {
			System.out.println("Imi place!");
		}
		else if (emisiune.getTipEmisiune().equals(Tip.POLITICA)){
			System.out.println("Meh!");
		}
		else if (emisiune.getTipEmisiune().equals(Tip.DESENE)) {
			System.out.println("Nu imi place!");
		}
		
	}
}
