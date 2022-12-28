
public class ClientCopil extends Client {

	public ClientCopil(String nume, int varsta, int buget) {
		super(nume, varsta, buget);
	}

	public void cumparaprodus(Produse produs) {
		
		if(this.getBuget()>produs.getPret() && produs.getStoc()>0) {
			if(this.getVarsta() < 10) 
				{
					if(produs.getTipProdus() == Tip.ELECTROCASNIC)
					System.out.println("Copilul nu poate sa cumpere electrocasnice!");
					else 
						System.out.println("Copil "+this.toString());
				}
			else 
				System.out.println("Copil "+this.toString());
		}
		else System.out.println("Produs out of stoc sau mai mare ca bugetul!");
		
	}
	
}
