public class Student implements Cloneable{

	private String nume;
	private String prenume;
	Masina masina;
	
	public Student(String nume, String prenume, Masina masina) {
	
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMasina() {
		return masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
