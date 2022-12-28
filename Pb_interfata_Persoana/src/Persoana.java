import java.util.Arrays;

public class Persoana implements Comparable {

	private String nume;
	private String prenume;
	private int varsta;
	
	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
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

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + "]\n";
	}
	

	@Override
	public int compareTo(Object object) {

		//Persoana persoana =(Persoana) object;
		if(this.nume.compareTo(((Persoana) object).getNume())==0) {
			
			if(this.prenume.compareTo(((Persoana) object).getPrenume())==0) {
				
				return this.getVarsta()-((Persoana) object).getVarsta();
				
			}
			else return this.prenume.compareTo(((Persoana) object).getPrenume());
		}
		return nume.compareTo(((Persoana) object).getNume());
		
	}
	/*
	public int compareTo(Object object) {

		Persoana persoana =(Persoana) object;
		return persoana.getNume().compareTo(this.getNume());
		
	}*/
	
}
