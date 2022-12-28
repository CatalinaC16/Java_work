
public class TestShopping {

	public static void main(String[] args) {
		
		Client client= new Client("Ion",44,300);
		Parinte parinte= new Parinte("Maria",35,600);
		Copil copil= new Copil("Ionut",9,300);
		Bunic bunic= new Bunic("Gheorghe",67,200);
		
		Produse p1 = new Produse("birou",600,3,TipProdus.ELECTROCASNIC);
		Produse p2 = new Produse("platou",50,4,TipProdus.MANCARE);
		Produse p3 = new Produse("masinuta",100,5,TipProdus.JUCARIE);
		Produse p4 = new Produse("papusa",130,2,TipProdus.JUCARIE);
		
		client.cumparaProdus(p4);
		parinte.cumparaProdus(p1);
		bunic.cumparaProdus(p4);
		copil.cumparaProdus(p4);
		copil.cumparaProdus(p1);
		System.out.println("\n");
		
		Comanda comanda1 = new Comanda(24,parinte);
		comanda1.adaugareProdus(p4);
		comanda1.adaugareProdus(p1);
		comanda1.adaugareProdus(p3);
		System.out.println("\n");
		System.out.println(comanda1);
		System.out.println("\n");
		comanda1.stergereProdus(p4);
		System.out.println(comanda1);
		System.out.println("Totalul comenzii este: "+comanda1.totalComanda());
	
	}

}
