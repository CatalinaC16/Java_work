import java.awt.Color;

public class Autovehicul {

	 private int viteza;
	 private int vitezaMaxima;
    
    private int nrPasageri;
    protected String marca;
    
    private int treaptaCurenta;
    private int nrTrepte;
    
    private Color culoare;
    Sofer sofer;

	
	public Autovehicul(int viteza, int vitezaMaxima, int nrPasageri, String marca, int treaptaCurenta, int nrTrepte,
			Color culoare, Sofer sofer) {
		this.viteza = viteza;
		this.vitezaMaxima = vitezaMaxima;
		this.nrPasageri = nrPasageri;
		this.marca = marca;
		this.treaptaCurenta = treaptaCurenta;
		this.nrTrepte = nrTrepte;
		this.culoare = culoare;
		this.sofer = sofer;
	}


	protected void mesaj() {
		System.out.println("Acesta este un autovehicul!!!");
	}
	
	protected void accelerare(int x) {
		this.viteza += x;
	}
	protected void decelerare(int x) {
		this.viteza -= x;
	}

	@Override
	public String toString() {
		return "viteza=" + viteza + "\nvitezaMaxima=" + vitezaMaxima + "\nnrPasageri=" + nrPasageri
				+ "\nmarca=" + marca + "\ntreaptaCurenta=" + treaptaCurenta + "\nnrTrepte=" + nrTrepte + "\nculoare="
				+ culoare+"\n"+sofer.toString();
	}

	public int getViteza() {
		return viteza;
	}

	public void setViteza(int viteza) {
		this.viteza = viteza;
	}

	public int getVitezaMaxima() {
		return vitezaMaxima;
	}

	public void setVitezaMaxima(int vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}

	public int getNrPasageri() {
		return nrPasageri;
	}

	public void setNrPasageri(int nrPasageri) {
		this.nrPasageri = nrPasageri;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTreaptaCurenta() {
		return treaptaCurenta;
	}

	public void setTreaptaCurenta(int treaptaCurenta) {
		this.treaptaCurenta = treaptaCurenta;
	}

	public int getNrTrepte() {
		return nrTrepte;
	}

	public void setNrTrepte(int nrTrepte) {
		this.nrTrepte = nrTrepte;
	}

	public Color getCuloare() {
		return culoare;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}
    

}
