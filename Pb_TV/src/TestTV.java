
public class TestTV {

	public static void main(String[] args) {
		
		TelespectatorAdult t1 =new TelespectatorAdult("ion",45);
		TelespectatorCopil t2 =new TelespectatorCopil("maria",5);
		TelespectatorPensionar t3 =new TelespectatorPensionar("alex",70);
		Telespectator t4 =new Telespectator("cata",20);
		

		Emisiunea e1 = new Emisiunea("Politica", 1,TipEmisiune.POLITICA);
		Emisiunea e2 = new Emisiunea("stiri", 2,TipEmisiune.STIRI);
		Emisiunea e3 = new Emisiunea("desene", 3,TipEmisiune.DESENE);
		Emisiunea e4 = new Emisiunea("sport", 2,TipEmisiune.SPORT);

		t1.evalueazaEmisiunea(e4);
		t2.evalueazaEmisiunea(e2);
		t4.evalueazaEmisiunea(e1);
		t3.evalueazaEmisiunea(e1);
		
		ProgramTV program = new ProgramTV(3,t4);
		program.adaugaEmisiune(e4);
		program.adaugaEmisiune(e1);
		program.adaugaEmisiune(e2);
		
		System.out.println(program);
		
		program.stergeEmisiune(e4);
		System.out.println(program);
		
	}

}
