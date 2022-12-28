
public class Restaurant {

	public static void main(String[] args) {
	
		Mancare p1= new Mancare("pizza", 20,1,250,500);
		Mancare p2= new Mancare("salata", 20,1,200,500);
		Mancare p3= new Mancare("mici", 20,1,200,500);
		
		Bautura p4= new Bautura("bere",5,1,100,5);
		Bautura p5= new Bautura("limo",10,1,80,0);
		Bautura p6= new Bautura("fanta",5,1,100,0);
		
		Desert p7 = new Desert("inghetata", 10, 1, 200,  true);
		Desert p8 = new Desert("praji", 10, 1, 200, true);
		Desert p9 = new Desert("sorbet", 10, 1, 200, false);
		
		Comanda comanda = new Comanda(34);
		System.out.println("\n**ADAUGAM PRODUSE IN COMANDA");
		comanda.adaugaProdus(p1);
		comanda.adaugaProdus(p2);
		comanda.adaugaProdus(p3);
		comanda.adaugaProdus(p4);
		comanda.adaugaProdus(p5);
		comanda.adaugaProdus(p6);
		comanda.adaugaProdus(p7);
		comanda.adaugaProdus(p8);
		
		comanda.afisareproduse();
		
		System.out.println("\nEste produsul in comanda? "+comanda.gasesteProdus(p9));
		System.out.println("Este produsul in comanda? "+comanda.gasesteProdus(p2));
		
		System.out.println("\n**STERGEM PRODUSE DIN COMANDA");
		comanda.stergeprodus(p3);
		comanda.stergeprodus(p4);
		
		comanda.afisareproduse();
		
		System.out.println("\nValoarea bauturilor este: " + comanda.calculeazaValoareaBauturilor());
		System.out.println("Valoarea totala este: " + comanda.totalComanda());
		
		System.out.println("Nr deserturi colorate este: " + comanda.numaraDeserturiColorate());
		System.out.println("\nGASIM produs dieta :");
		comanda.gasesteProdusDieta();
		
		comanda.sortareProduseCalorice();
		System.out.println("\nSortarea produselor crescator dupa numarul de calorii:");
		comanda.afisareproduse();
		
	}

}
