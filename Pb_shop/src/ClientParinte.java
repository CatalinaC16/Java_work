
public class ClientParinte extends Client {

	public ClientParinte (String nume, int varsta, int buget) {
		super(nume, varsta, buget);
	}
	
	public void cumparaprodus(Produse produs) {
		if(produs.getPret()<500 && produs.getStoc()>0)
			System.out.println("Parinte "+ this.toString());
		else System.out.println("Produs out of stoc sau mai mare ca bugetul!");
		
	}
}
