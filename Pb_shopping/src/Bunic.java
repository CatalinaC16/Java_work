
public class Bunic extends Client {

	public Bunic(String nume, int varsta, int buget){
		super(nume, varsta, buget);
	}
	
	public void cumparaProdus(Produse produs){

		if(this.getBuget()-produs.getPret()>100 && produs.getStoc()>0) {
			super.cumparaProdus(produs);
		}
		else System.out.println("NU poate sa cumpere produs scade buget sub 100 sau out of stoc!");

	}
}
