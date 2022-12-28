
public class TestClass {

	public static void main(String[] args) {
		ClientBunic bunic = new ClientBunic("ion",70,200);
		ClientCopil copil = new ClientCopil("mia", 9, 900);
		ClientParinte parinte = new ClientParinte("marian",36,800);
		Client client = new Client("ionel",37,500);
		
		Produse p1 = new Produse("televizor",400,3,Tip.ELECTROCASNIC);
		Produse p2 = new Produse("platou",300,3,Tip.MANCARE);
		Produse p3 = new Produse("papusa",100,3,Tip.JUCARIE);
		Produse p4 = new Produse("masinuta",90,3,Tip.JUCARIE);
		
		bunic.cumparaprodus(p1);
		bunic.cumparaprodus(p4);
		parinte.cumparaprodus(p1);
		copil.cumparaprodus(p1);
		copil.cumparaprodus(p2);
	
	
		Comanda comanda = new Comanda(34,parinte);
		comanda.adaugareProdus(p4);
		comanda.adaugareProdus(p1);
		comanda.adaugareProdus(p2);
		
		comanda.afisareProduse();
		comanda.stergereProdus(p4);
		comanda.afisareProduse();
		
		System.out.println("Totalul comenzii este "+ comanda.totalComanda());
	}

}
