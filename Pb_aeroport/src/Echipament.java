
public class Echipament {

	private String cod;

	public Echipament(String cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "Echipament [cod=" + cod + "]";
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
}
