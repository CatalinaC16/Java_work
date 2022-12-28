
public class FelPrincipal extends Preparate {

	protected int calorii;
	protected String tipCarne;
	protected String gluten;
	
	public FelPrincipal(String specific, String nume, String id, int calorii, String tipCarne, String gluten) {
		super(specific,nume,id);
		this.calorii = calorii;
		this.tipCarne = tipCarne;
		this.gluten = gluten;
	}
	
	@Override
	public String toString() {
		return super.toString()+" calorii=" + calorii + ", tipCarne=" + tipCarne + ", gluten=" + gluten + "]\n";
	}

	public int getCalorii() {
		return calorii;
	}
	public void setCalorii(int calorii) {
		this.calorii = calorii;
	}
	public String getTipCarne() {
		return tipCarne;
	}
	public void setTipCarne(String tipCarne) {
		this.tipCarne = tipCarne;
	}
	public String getGluten() {
		return gluten;
	}
	public void setGluten(String gluten) {
		this.gluten = gluten;
	}
}
