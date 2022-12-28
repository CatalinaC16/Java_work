
public abstract class Rechizita {
	//nu putem instantia obiecte de tipul Rechizita
	
	protected String eticheta;	
	
	
	public abstract String getEticheta();
	
	public abstract void setEticheta(String eticheta);
	
	public String toString() {
		
		return eticheta;
	}

}
