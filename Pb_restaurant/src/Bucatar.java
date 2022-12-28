import java.util.Arrays;

public class Bucatar  {

	protected String nume;
	protected int vechime;
	protected String adresa;
	
	public static final int NR_MAX = 4;
	public Integer nrOrdine=0;
	Preparate[] toDo = new Preparate[NR_MAX];
	
	public Bucatar(String nume, int vechime, String adresa) {
		this.nume = nume;
		this.vechime = vechime;
		this.adresa = adresa;
		
	}
	
	public void addBautura(Bautura b) {
		toDo[nrOrdine] = new Bautura(b.specific, b.nume, nrOrdine.toString()+b.nume.subSequence(0,2),b.alcolemie,b.cantitate);
	    nrOrdine++;
	    
	}
	public void addFelPrincipal(FelPrincipal b) {
		toDo[nrOrdine] = new FelPrincipal(b.specific, b.nume, nrOrdine.toString()+b.nume.subSequence(0,2),b.calorii,b.tipCarne,b.gluten);
		   nrOrdine++;
	}
	
	
	@Override
	public String toString() {
		return "Bucatar [nume=" + nume + ", vechime=" + vechime + ", adresa=" + adresa + ", nrOrdine=" + nrOrdine
				+ ", toDo=" + Arrays.toString(toDo) + "]";
	}
	
	public void toDoBauturi() {
		for(Preparate i : toDo) {
			if(i instanceof Bautura)	
				System.out.println("Bucatar [nume=" + nume + ", vechime=" + vechime + ", adresa=" + adresa + ", nrOrdine=" + nrOrdine
					+ ", toDo=" + i.toString() + "]");
		}
	
	}
	
	public void daSpreServire(Preparate p) {

		for(int i = 0; i< nrOrdine; i++) {
			if(toDo[i].nume.equalsIgnoreCase(p.nume)){
				for( int j=i; j<nrOrdine;j++) {
					toDo[j]= toDo[j+1];
								
				}
				nrOrdine--;
			}
		}
	}
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void getBucatar(int vechime) {
		if(this.vechime == vechime) {
			this.toString();		}
	}

}
