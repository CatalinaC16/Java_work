import java.util.Arrays;

public class Comanda {
 
	private int id;
	Client client;
	protected int nrProduse;
	public static final int  NR_MAX=10;
	Produse[] produse = new Produse[NR_MAX];

		
	public Comanda(int id, Client client) {
		this.id = id;
		this.client = client;
		
	}

	public void adaugareProdus(Produse produs) {
		if(nrProduse<NR_MAX) {
			produse[nrProduse]= new Produse(produs.getNume(),produs.getPret(),produs.getStoc(),produs.getTipProdus());
		    nrProduse++;
		    System.out.println("Clientul "+client.getNume()+" a adaugat produsul "+produs.getNume());
		}
		else System.out.println("Prea multe produse!");
	}
	
	public void stergereProdus(Produse produs) {
	
		for( int i =0 ;i < nrProduse ;i++) {
			
			if(produse[i].getNume().equalsIgnoreCase(produs.getNume())) {
			
				for(int j=i; j<nrProduse;j++) {
					produse[j]=produse[j+1];
				}
				nrProduse--;
					
			}
		}	
	}
	
	public int totalComanda(){
		int total = 0;
		for(int i= 0 ; i<nrProduse ;i++) {
			total = total + produse[i].getPret();
		}		
		return total;
	}
	

	
	@Override
	// asta e afisare comanda, nu am mai redenumit 
	public String toString() {
		return "Comanda [id=" + id + ", client=" + client + ", produse=" + Arrays.toString(produse) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
