
public class Card implements Comparable{

	private String nume;
	private int pin;
	private double sold;
    private TipCard tip;
    


	public Card(String nume, int pin, double sold, TipCard tip) {
		super();
		this.nume = nume;
		this.pin = pin;
		this.sold = sold;
		this.tip = tip;
	}

	public TipCard getTip() {
		return tip;
	}

	public void setTip(TipCard tip) {
		this.tip = tip;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "Card [nume=" + nume + ", pin=" + pin + ", sold=" + sold + ", tip=" + tip + "]";
	}

	@Override
	public int compareTo(Object o) {

		return this.getNume().compareTo(((Card)o).getNume());
	}

	
}
