
public class Student {

	private int nrMatricol;
	private String nume;
	private boolean areBursa;
	
	public Student(int nrMatricol, String nume, boolean areBursa) {
		this.nrMatricol = nrMatricol;
		this.nume = nume;
		this.areBursa = areBursa;
	}

	@Override
	public String toString() {
		return "Student [nrMatricol=" + nrMatricol + ", nume=" + nume + ", areBursa=" + areBursa + "]";
	}

	public int getNrMatricol() {
		return nrMatricol;
	}

	public void setNrMatricol(int nrMatricol) {
		this.nrMatricol = nrMatricol;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean isAreBursa() {
		return areBursa;
	}

	public void setAreBursa(boolean areBursa) {
		this.areBursa = areBursa;
	}
	
	
	
	
	
}
