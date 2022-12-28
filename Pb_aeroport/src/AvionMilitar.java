import java.util.Arrays;

public class AvionMilitar extends Aeronava{
	
	Echipament[] echipament = new Echipament[10];
	protected int nrEchipament;
	public AvionMilitar(String nume, String numePilot, int combustibil, Pozitie stare, int NRMAX) {
		super(nume, numePilot, combustibil, stare,NRMAX);
		
	}
	
	@Override
	public String toString() {
		return "\n  AvionMilitar"+ super.toString()+"[echipament=" + Arrays.toString(echipament) + "]";
	}

	public void addEchipament(Echipament echi) {
		
		echipament[nrEchipament]= new Echipament(echi.getCod());
		nrEchipament++;
	}
	
	public void descarcEchipament(Echipament echi) {
		for(int i = 0; i < nrEchipament; i++) {
			if(echipament[i].getCod().equalsIgnoreCase(echi.getCod())) {
				
				for(int j = i ; j < nrEchipament ; j++) {
					echipament[j]= echipament[j+1];
				}
				nrEchipament--;
			}
		}
	}
}
