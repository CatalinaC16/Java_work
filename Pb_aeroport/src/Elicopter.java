
public class Elicopter extends Aeronava {

	public Elicopter(String nume, String numePilot, int combustibil, Pozitie stare, int NRMAX) {
		super(nume, numePilot, combustibil, stare,NRMAX);
		
	}

	public void mesajSonor(String mesaj) {
		System.out.println("Mesajul elicopterului este "+ mesaj);
	}

	@Override
	public String toString() {
		return "\n  Elicopter []"+super.toString();
	}
}
