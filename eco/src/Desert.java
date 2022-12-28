
public class Desert extends Produs {

	boolean contineColorant;

	public Desert(String denumire, double pret, int cantitate, int kcal, boolean contineColorant) {
		super(denumire, pret, cantitate, kcal);
		this.contineColorant = contineColorant;
	}

	public boolean isContineColorant() {
		return contineColorant;
	}

	@Override
	public String toString() {
		return super.toString() + "Desert [contineColorant=" + contineColorant + "]";
	}

	public void setContineColorant(boolean contineColorant) {
		this.contineColorant = contineColorant;
	}
	

	
}
