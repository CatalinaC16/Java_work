
public class Parinte extends Client{

	public Parinte(String nume, int varsta, int buget){
		super(nume, varsta, buget);
	}
	
	public void cumparaProdus(Produse produs){

		if(produs.getPret() < 500 && produs.getStoc()>0) {
			super.cumparaProdus(produs);
		
		}
		else System.out.println("NU poate sa cumpere produs peste 500 lei sau out of stoc!");

	}
}
