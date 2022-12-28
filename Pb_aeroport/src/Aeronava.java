
public class Aeronava {

	private String nume;
	private String numePilot;
	public int NRMAX;
	private int combustibil;
	private Pozitie stare;
	
	public Aeronava(String nume, String numePilot, int combustibil, Pozitie stare,int NRMAX) {
		this.nume = nume;
		this.numePilot = numePilot;
		this.combustibil = combustibil;
		this.stare = stare;
		this.NRMAX=NRMAX;
	}
	public void stareActuala(String stare) {
		if(stare.equalsIgnoreCase("decolare")) {
			System.out.println("Aeronava "+this.toString()+"a decolat!");
			this.setStare(Pozitie.DECOLAT);
			
		}
		else {
			System.out.println("Aeronava "+this.toString()+"a aterizat!");
			this.setStare(Pozitie.ATERIZAT);
		}
	
	}
	public void alimentare(int litri) {
		int l = this.getCombustibil();
		l+=litri;
		this.setCombustibil(l);
	}
	@Override
	public String toString() {
		return " Aeronava [nume=" + nume + ", numePilot=" + numePilot + ", combustibil=" + combustibil + ", stare="
				+ stare + "]";
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNumePilot() {
		return numePilot;
	}
	public void setNumePilot(String numePilot) {
		this.numePilot = numePilot;
	}
	public int getNRMAX() {
		return NRMAX;
	}
	public  void setNRMAX(int nRMAX) {
		NRMAX = nRMAX;
	}
	public int getCombustibil() {
		return combustibil;
	}
	public void setCombustibil(int combustibil) {
		this.combustibil = combustibil;
	}
	public Pozitie getStare() {
		return stare;
	}
	public void setStare(Pozitie stare) {
		this.stare = stare;
	}

	
}
