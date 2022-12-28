import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		Scanner scaner= new Scanner(System.in);
		String x = scaner.nextLine();
		System.out.println(x+"\n");
		
		
		TelespectatorAdult t1 = new TelespectatorAdult("ion", 35);
		TelespectatorCopil t2 = new TelespectatorCopil("mia", 5);
		TelespectatorPensionar t3 = new TelespectatorPensionar("maria",67);
		Telespectator t4 = new Telespectator("cata",20);
		
		Emisiunea e1 = new Emisiunea("politics",2,Tip.POLITICA);
		Emisiunea e2 = new Emisiunea("disney",2,Tip.DESENE);
		Emisiunea e3 = new Emisiunea("meciul",1,Tip.SPORT);
		Emisiunea e4 = new Emisiunea("news",2,Tip.STIRI);
		Emisiunea e5 = new Emisiunea("sport",2,Tip.SPORT);
		
		t1.evalueazaEmisiunea(e2);
		t2.evalueazaEmisiunea(e3);
		t2.evalueazaEmisiunea(e5);
		t3.evalueazaEmisiunea(e1);
		
		ProgramTV program = new ProgramTV(5,t3);
		program.adaugaEmisiune(e3);
		program.adaugaEmisiune(e5);
		program.adaugaEmisiune(e2);
		System.out.println(program);
		program.stergeEmisiune(e5);
		System.out.println(program);
		
	}

}
