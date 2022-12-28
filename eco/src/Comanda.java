import java.util.Arrays;

public class Comanda {

	private int numarComanda;
	public static final int NUMAR_MAXIM_PRODUSE=15;
	protected int numarProduse;
	Produs[] produse = new Produs[NUMAR_MAXIM_PRODUSE];
	

	public Comanda(int numarComanda) {
		this.numarComanda = numarComanda;
	}
	
	public void adaugaProdus(Produs produs) {
		
	  if(numarProduse< NUMAR_MAXIM_PRODUSE) {
		  produse[numarProduse] = produs;
		  numarProduse++;
		  System.out.println("Produsul "+ produs.toString() + " a fost adaugat in comanda!");
	  }
	  else System.out.println("Din pacate, nu mai poti adauga produse");	  
	}
	
	public boolean gasesteProdus(Produs produs) {
		///pp ca nu este in comanda
		boolean okk= false;
		for(int i = 0; i < numarProduse; i++) {
			
			if(produse[i].getDenumire().equalsIgnoreCase(produs.getDenumire()))
				okk= true;			
		}
		return okk;
		
	}
	public void stergeprodus(Produs produs) {
		if(gasesteProdus(produs)) {
			
			for(int i =0; i<numarProduse;i++) {
				
				if(produse[i].getDenumire().equalsIgnoreCase(produs.getDenumire())) {
					for(int j=i;j<numarProduse;j++) {
					
						produse[j]=produse[j+1];
					}
				numarProduse--;
		System.out.println("A fost sters produsul "+produs.getDenumire());
			}
		}
	  }
		else  System.out.println("Produsul nu este in comanda!");
	}
	public int numaraDeserturiColorate() {
		
		int nr=0;
		
		for(int i=0;i<numarProduse;i++) {
			
			if(produse[i] instanceof Desert) {
				
				if(((Desert)produse[i]).isContineColorant())
				nr++;
			}
			
		}
		return nr;
	}
	
	public void gasesteProdusDieta(){
		int minKal=9999;
		Produs produs= new Produs(null,0,0,0);
		
		for(int i=0;i<numarProduse;i++) {		
				
				if(produse[i].getKcal() < minKal) {
					produs =produse[i];
					minKal = produse[i].getKcal();
				}

		}
		System.out.println("Minimul de calorii este:"+minKal+ " iar produsul este"+ produs.toString());
		
	}
	
	public void afisareproduse() {
		
     System.out.println("\nProdusele din comanda sunt:");
		for(int i = 0; i < numarProduse; i++) {
			
         System.out.println(produse[i].toString());
					
		}
	}
	
	public double calculeazaValoareaBauturilor() {
	 double total =0.0;
		for(int i = 0; i <numarProduse; i++) {
			if(produse[i] instanceof Bautura) {
				total= total + (produse[i].getPret())*(produse[i].getCantitate());
			}
		}
		return total;
	}
	
	public double totalComanda() {
		double total =0.0;
		for(int i = 0; i <numarProduse; i++) {
		
				total = total + (produse[i].getPret())*(produse[i].getCantitate());
		}
		return total;
	}
	
	public void sortareProduseCalorice() {
		Produs produs= new Produs(null,0,0,0);
    	 for (int i = 0; i < numarProduse-1; i++) {
    		  for (int j = 0; j <  numarProduse - i - 1; j++) {
    			  if (produse[j].getKcal() > produse[j+1].getKcal())
    			  {
    				  produs=produse[j];
    				  produse[j]= produse[j+1];
    				  produse[j+1]=produs;
    			  }
    		  }
  	            
    	 }
    	      
	}

	
	@Override
	public String toString() {
		return "Comanda [numarComanda=" + numarComanda + ", numarProduse=" + numarProduse + ", produse="
				+ Arrays.toString(produse) + "]";
	}

	public int getNumarComanda() {
		return numarComanda;
	}
	public void setNumarComanda(int numarComanda) {
		this.numarComanda = numarComanda;
	}
	
}
