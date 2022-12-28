
public class Servire {

	public static void main(String[] args) {
		
		Meniu meniu = new Meniu();
		
		Bautura b1 = new Bautura("italian", "limo", "23", "nu", 400);
		Bautura b2 = new Bautura("german", "bere", "23", "da", 600);
		Bautura b3 = new Bautura("german", "bere", "23", "da", 500);
		
	    meniu.addBautura(b3);
	    meniu.addBautura(b1);
	    meniu.addBautura(b2);
	 
	    
	    FelPrincipal m1 = new FelPrincipal("italian", "paste","34",500, "vita","da");
	    FelPrincipal m2 = new FelPrincipal("grecesc", "salata","34",300, "nu","nu");
	    FelPrincipal m3 = new FelPrincipal("romanesc", "mici","34",480, "porc","nu");
    
	    meniu.addFelPrincipal(m3);
	    meniu.addFelPrincipal(m2);
	    meniu.addFelPrincipal(m1);
	    
	    System.out.println(meniu+"\n");
	    
	    Bucatar om1 = new Bucatar("Nicu",23,"adr");
	    Bucatar om2 = new Bucatar("Andrei",3,"adr");
	    Bucatar om3= new Bucatar("Picu",35,"adr");
	    
	    System.out.println("NR BAUTURI "+meniu.nrBauturi());
	    System.out.println("NR FELURI "+meniu.nrFelPrincipal());
	    
	    om1.addBautura(b1);
	    om1.addFelPrincipal(m1);
	    om2.addBautura(b2);
	    om2.addFelPrincipal(m2);
	    om3.addBautura(b3);
	    om3.addFelPrincipal(m3);
	    
	    System.out.println("\n"+om1+"\n");
	    System.out.println(om2+"\n");
	    System.out.println(om3+"\n");
	    
	    om3.toDoBauturi();
	    
	   /*int[] bucatari = {om1.vechime,om2.vechime, om3.vechime} ;
	   int maxVechime = 0;
	   for(int i=0; i<bucatari.length ;i++) {
		   if(bucatari[i]>maxVechime) {
			   maxVechime= bucatari[i];
		   }
	   } */
	    int maxVechime= 0;
	    Bucatar[] bucatari = {om1,om2,om3};
	    for(Bucatar i : bucatari) {
	    	if(maxVechime < i.getVechime()) {
	    		maxVechime = i.getVechime();
	    }
     }
	    for(Bucatar i : bucatari) {
          i.getBucatar(maxVechime);
	    }
	    
	    om2.daSpreServire(b2);	  
	    System.out.println(om2);
	}

}
