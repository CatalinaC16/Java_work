
public class Pasager {

	protected  String nume;
	protected  String prenume;
	Bilet bilet;
		
	public Pasager(String nume, String prenume, Bilet bilet) {
		this.nume = nume;
		this.prenume = prenume;
		this.bilet = new Bilet(bilet.numarBilet, bilet.pret);
		pretBilet(bilet);
	}
	
	public void pretBilet(Bilet bilet)
	{
		int pret = bilet.pret;
		this.bilet.pret = pret;
	}
	
		@Override
	public String toString() {
		return "\nPasager [nume=" + nume + ", prenume=" + prenume + ", bilet=" + bilet + "]";
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
	public Bilet getBilet() {
		return bilet;
	}
	
	public void setBilet(Bilet bilet) {
		this.bilet = bilet;
	}
	
}
