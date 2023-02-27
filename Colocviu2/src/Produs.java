
public class Produs {
	
	private int idProdus;
	private String nume;
	private String producator;
	private double pret;
	private int garantie;
	private TipProdus tip;
	
	
	public Produs(int idProdus, String nume, String producator, double pret, TipProdus tip,int garantie) {
		super();
		this.idProdus = idProdus;
		this.nume = nume;
		this.producator = producator;
		this.pret = pret;
		this.tip = tip;
		this.garantie = garantie;
	}
	
	public int getGarantie() {
		return garantie;
	}

	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}
	public int getIdProdus() {
		return idProdus;
	}

	public void setIdProdus(int idProdus) {
		this.idProdus = idProdus;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getProducator() {
		return producator;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public TipProdus getTip() {
		return tip;
	}

	public void setTip(TipProdus tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Produs [idProdus=" + idProdus + ", nume=" + nume + ", producator=" + producator + ", pret=" + pret
				+ ", tip=" + tip + "]";
	}
	
}
