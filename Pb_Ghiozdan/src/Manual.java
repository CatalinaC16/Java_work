
public class Manual extends Rechizita {

	public Manual(String eticheta) {
		this.setEticheta(eticheta);
	}
	
	public String getEticheta() {
		return eticheta+ " = Manual";
	}
	
	public void setEticheta(String eticheta) {
		
		this.eticheta = eticheta;
	}
}
