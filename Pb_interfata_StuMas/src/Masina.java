import java.awt.Color;

public class Masina {

	private String marca;
	private Color culoare;
	
	public Masina(String marca, Color culoare) {
		super();
		this.marca = marca;
		this.culoare = culoare;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Color getCuloare() {
		return culoare;
	}
	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}
	
}
