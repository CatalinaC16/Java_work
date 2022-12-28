import java.util.Arrays;

public class Aeroport {

	protected int nrAeronave;
	Aeronava[] aeronave = new Aeronava[10];
	
     public void addAeronava(Aeronava aero) {
		
    	 aeronave[nrAeronave]= aero;
		nrAeronave++;
	}
	
	public void delAeronava(Aeronava aero) {
		for(int i = 0; i < nrAeronave; i++) {
			if(aeronave[i].getNume().equalsIgnoreCase(aero.getNume())) {
				
				for(int j = i ; j < nrAeronave ; j++) {
					aeronave[j]= aeronave[j+1];
				}
				nrAeronave--;
			}
		}
	}

	@Override
	public String toString() {
		return "Aeroport [nrAeronave=" + nrAeronave + ", aeronave=" + Arrays.toString(aeronave) + "]";
	}
}
