
public class TelespectatorAdult extends Telespectator {

	public TelespectatorAdult(String nume, int varsta) {
		super(nume, varsta);
		
	}
	public void evalueazaEmisiunea(Emisiunea emisiune) {
		if(emisiune.getTip() == TipEmisiune.STIRI ||emisiune.getTip() == TipEmisiune.SPORT) {
			System.out.println("Imi place!");
		}
		else if(emisiune.getTip() == TipEmisiune.POLITICA) {
			System.out.println("Meh”!");
		}
		else if(emisiune.getTip() == TipEmisiune.DESENE) {
			 System.out.println("NU imi place!");
		}
	}
}
