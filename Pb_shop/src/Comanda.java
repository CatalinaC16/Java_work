import java.util.Arrays;

public class Comanda {

	private int id;
	protected int nrProdus;
	public static final int  NRMAX = 5;
	Client client;
	Produse[] produse = new Produse[NRMAX];
	
	
	public Comanda(int id, Client client) {
		this.id = id;
		this.client = client;
	}
	public void afisareProduse() {
		System.out.println(this.toString());
	}

	public void adaugareProdus(Produse produs) {
		if(nrProdus<NRMAX) {
			produse[nrProdus] = new Produse(produs.getNume(), produs.getPret(),produs.getStoc(),produs.getTipProdus());
			nrProdus++;
			System.out.println("Clientul "+ client.getNume()+ " a adaugat produsul " +produs.getNume());
		}
		else System.out.println("nu se mai pot adauga produse");
	}
	
	public void stergereProdus(Produse produs) {
		for(int i=0;i<nrProdus;i++) {
			if(produse[i].getNume().equalsIgnoreCase(produs.getNume())) {
				for(int j=i;j<nrProdus;j++) {
					produse[j]=produse[j+1];
				}
			nrProdus--;
			System.out.println("Clientul "+ client.getNume()+" a sters produsul "+produs.getNume()+" din comanda");
		}
	}
}
	
	public int totalComanda() {
		int total = 0;
		for(int i= 0 ;i<nrProdus;i++) {
			total+=produse[i].getPret();
			}
		return total;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Comanda [id=" + id + ", client=" + client + ", produse=" + Arrays.toString(produse) + "]";
	}
	
}
