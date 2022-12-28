import java.util.Arrays;

public class Meniu {

	public static final int NR_MAX = 10;
	public Integer nrOrdine =0;
	Preparate[] meniu = new Preparate[NR_MAX];
	
	public void addBautura(Bautura b) {
		meniu[nrOrdine] = new Bautura(b.specific, b.nume, nrOrdine.toString()+b.nume.subSequence(0,2),b.alcolemie,b.cantitate);
	    nrOrdine++;
	}
	public void addFelPrincipal(FelPrincipal b) {
		meniu[nrOrdine] = new FelPrincipal(b.specific, b.nume, nrOrdine.toString()+b.nume.subSequence(0,2),b.calorii,b.tipCarne,b.gluten);
		 nrOrdine++;
	}

	public int nrBauturi() {
		int nr= 0; 
		for(Preparate i: meniu) {
			if(i instanceof Bautura) {
				nr++;
			}
		}
		return nr;
	}
	public int nrFelPrincipal() {
		int nr= 0; 
		for(Preparate i: meniu) {
			if(i instanceof FelPrincipal) {
				nr++;
			}
		}
		return nr;
	}
	@Override
	public String toString() {
		return "Meniu\n [nrOrdine=" + nrOrdine + ", MENIU \n" + Arrays.toString(meniu) + "]\n";
	}
	
	
}
