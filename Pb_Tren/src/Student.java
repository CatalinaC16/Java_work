
public class Student extends Pasager{

	protected String denumireFacultate;

	
	public Student(String nume, String prenume, Bilet bilet, String denumireFacultate) {
		super(nume, prenume, bilet);
		this.denumireFacultate = denumireFacultate;
	}

	public void pretBilet(Bilet bilet)
	{
		int pret = this.bilet.pret;
		pret =(int) (pret - 0.5*pret);
		this.bilet.pret = pret;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Student  [denumireFacultate=" + denumireFacultate + "]";
	}

	public String getDenumireFacultate() {
		return denumireFacultate;
	}

	public void setDenumireFacultate(String denumireFacultate) {
		this.denumireFacultate = denumireFacultate;
	}
	
}
