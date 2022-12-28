import java.util.Arrays;

public class ProgramTV {

	private int id;
	protected int nrEmisiune;
	public static final int NRMAX = 5;
	Telespectator telespectator;
	Emisiunea[] emisiuni = new Emisiunea[NRMAX];
	
	public ProgramTV(int id, Telespectator telespectator) {
		this.id = id;
		this.telespectator = telespectator;
		}
	
	public void adaugaEmisiune(Emisiunea emisiune) {
	 
		if(nrEmisiune< NRMAX) {
			emisiuni[nrEmisiune] = new Emisiunea(emisiune.getNume(), emisiune.getDurata(), emisiune.getTipEmisiune());
			nrEmisiune++;
			System.out.println("Telespectatorul "+telespectator.getNume()+" a adaugat emisiunea "+ emisiune.getNume()+" in programul TV");
		}
		else System.out.println("Program plin!");
	}
	public void stergeEmisiune(Emisiunea emisiune) {
		 
		for(int i=0; i<nrEmisiune;i++ ) {
			if(emisiuni[i].getNume().equalsIgnoreCase(emisiune.getNume())){
				
				for(int j=i;j<nrEmisiune;j++) {
					emisiuni[j]=emisiuni[j+1];
				}
				nrEmisiune--;
				System.out.println("Telespectatorul "+telespectator.getNume()+" a sters emisiunea "+ emisiune.getNume()+" din programul TV");
			}
		}
	}

	
	@Override
	public String toString() {
		return "ProgramTV [id=" + id + ", nrEmisiune=" + nrEmisiune + ", telespectator=" + telespectator + ", emisiuni="
				+ Arrays.toString(emisiuni) + "]";
	}
	
	
	
}
