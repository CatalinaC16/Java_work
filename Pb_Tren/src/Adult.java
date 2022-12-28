
public class Adult extends Pasager {

	public Adult(String nume, String prenume, Bilet bilet) {
		super(nume, prenume, bilet);
	
	}
	
	public void pretBilet(Bilet bilet)
	{
		int pret = bilet.pret;
		pret =(int) (pret - 0.1*pret);
		this.bilet.pret = pret;
	}

}
