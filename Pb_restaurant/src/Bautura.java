
public class Bautura extends Preparate{

	protected String alcolemie;
	protected int cantitate;
	
	
	public Bautura(String specific, String nume, String id,String alcolemie, int cantitate) {
		super(specific,nume,id);
		this.alcolemie = alcolemie;
		this.cantitate = cantitate;
	}
	
	@Override
	public String toString() {
		return super.toString()+" alcolemie=" + alcolemie + ", cantitate=" + cantitate + "]\n";
	}

	public String getAlcolemie() {
		return alcolemie;
	}
	public void setAlcolemie(String alcolemie) {
		this.alcolemie = alcolemie;
	}
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
}
