
public class Preparate{

	protected String specific;
	protected String nume;
	protected String id;
		
	
	public Preparate(String specific, String nume, String id) {
		this.specific = specific;
		this.nume = nume;
		this.id = id;
	}
	
	public String getSpecific() {
		return specific;
	}
	public void setSpecific(String specific) {
		this.specific = specific;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "specific=" + specific + ", nume=" + nume + ", id=" + id + "]";
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
