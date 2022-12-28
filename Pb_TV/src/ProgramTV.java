import java.util.Arrays;

public class ProgramTV {

	private int id;
	private int nrPrograme;
	Telespectator tele;
	public static final int NR_MAX = 6;
	Emisiunea[] emisiuni = new Emisiunea[NR_MAX];
	
	public ProgramTV(int id,Telespectator tele) {
		this.id = id;
		this.tele = new Telespectator(tele.getNume(),tele.getVarsta());
	}
	
	public void adaugaEmisiune(Emisiunea emisiune) {
	
		if(nrPrograme<NR_MAX) {
			emisiuni[nrPrograme] = new Emisiunea(emisiune.getNume(),emisiune.getDurata(),emisiune.getTip());
			nrPrograme++;
			System.out.println("Telespectatorul "+tele.getNume()+" a adaugat emisiunea "+emisiune.getNume());
		}
		else System.out.println("Nu s-a putut adauga!");
	}
	
	public void stergeEmisiune(Emisiunea emisiune) {
		
		for(int i=0; i<nrPrograme;i++) {
			if(emisiuni[i].getNume().equalsIgnoreCase(emisiune.getNume())) {
				
				for(int j=i ;j<nrPrograme;j++) {
					emisiuni[j]=emisiuni[j+1];
				}
				System.out.println("Telespectatorul"+tele.getNume()+"a sters emisiunea"+emisiune.getNume());
				nrPrograme--;
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ProgramTV [id=" + id + ", nrPrograme=" + nrPrograme + ", tele=" + tele + ", emisiuni="
				+ Arrays.toString(emisiuni) + "]";
	}
	
	
	
}
