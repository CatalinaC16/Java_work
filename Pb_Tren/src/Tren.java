import java.util.Arrays;

public class Tren {

	protected int nrTren;
	public static final int NR_MAX = 50;
	protected int nrPasageri= 0;
	Pasager[] pasageri = new Pasager[NR_MAX];
	
	public Tren(int nrTren) {
		this.nrTren = nrTren;
	}
	public int getNrTren() {
		return nrTren;
	}
	public void setNrTren(int nrTren) {
		this.nrTren = nrTren;
	}
	public Pasager[] getPasageri() {
		return pasageri;
	}
	public void setPasageri(Pasager[] pasageri) {
		this.pasageri = pasageri;
	}
	
	public void addPasager(Pasager pasager) {
		pasageri[nrPasageri] = new Pasager(pasager.nume,pasager.prenume,pasager.bilet);
		nrPasageri++;
	}	

	@Override
	public String toString() {
		return "Tren [nrTren=" + nrTren + ", nrPasageri=" + nrPasageri + ", pasageri:\n" + Arrays.toString(pasageri)
				+ "]";
	}

	public void debarcPasager(Pasager pasager) {
		for(int i=0; i<nrPasageri ; i++) {
			if(pasageri[i].nume.equals(pasager.nume))
			{ 
				for(int j= i;j<nrPasageri;j++) {
					pasageri[j]=pasageri[j+1];
				}
				nrPasageri--;
			}
			
		}
	}
	
}
