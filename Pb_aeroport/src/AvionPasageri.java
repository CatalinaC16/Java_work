import java.util.Arrays;

public class AvionPasageri extends Aeronava{
	protected int numarPasageri;
	Pasager[] pasageri = new Pasager[this.NRMAX];
	
	public AvionPasageri(String nume, String numePilot, int combustibil, Pozitie stare, int NRMAX) {
		super(nume, numePilot, combustibil, stare,NRMAX);
	}
	

	public void addPasager(Pasager pasager) {
		if(numarPasageri < getNRMAX()) {
			pasageri[numarPasageri]= new Pasager(pasager.getNume(),pasager.getVarsta());
			numarPasageri++;
		}
		else System.out.println("Avion FULL");
	}
	
	public void debarcPasager(Pasager pasager) {
		for(int i = 0; i < numarPasageri; i++) {
			if(pasageri[i].getNume().equalsIgnoreCase(pasager.getNume())) {
				
				for(int j = i ; j < numarPasageri ; j++) {
					pasageri[j]= pasageri[j+1];
				}
				numarPasageri--;
			}
		}
	}
	@Override
	public String toString() {
		return "\n  AvionPasageri" +super.toString()+"[numarPasageri=" + numarPasageri + ", pasageri=" + Arrays.toString(pasageri) + "]";
	}
	
	
	
}
