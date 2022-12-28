
public class Copil extends Client {
	
	public Copil(String nume, int varsta, int buget){
		super(nume, varsta, buget);
	}
	
	public void cumparaProdus(Produse produs){

		if(this.getVarsta()<10 && produs.getStoc()>0)	{
			if(produs.getTipProdus() != TipProdus.ELECTROCASNIC) {
				super.cumparaProdus(produs);
			}
			else System.out.println("Sub 10 ani nu poti sa cumperi electrocasnic!");
		}
		else System.out.println("Copil sub 10 ani sau produs out of stoc!");

	}
}
