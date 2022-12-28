
public class ClientBunic extends Client {
	
	public ClientBunic (String nume, int varsta, int buget) {
		super(nume, varsta, buget);
	}
	
	public void cumparaprodus(Produse produs) {
		if((this.getBuget()-produs.getPret())>100 && produs.getStoc()>0)
			System.out.println("Bunic "+ this.toString());
		else System.out.println("Produs out of stoc sau mai mare ca bugetul!");
		
	}
	

}
