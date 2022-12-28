
public class TelespectatorPensionar extends  Telespectator{

	public TelespectatorPensionar(String nume, int varsta) {
		super(nume, varsta);
		
	}
	
	public void evalueazaEmisiunea(Emisiunea emisiune) {
		
		if(emisiune.getTipEmisiune().equals(Tip.STIRI)||emisiune.getTipEmisiune().equals(Tip.POLITICA)) {
			System.out.println("ADOR!");
		}
		else
			System.out.println("Nu imi place!");		
	}
	
	
}
