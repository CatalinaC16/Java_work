package pb9_4;

import java.util.ArrayList;

public class FacebookAccount {

	private String nume;
	private int varsta;
	private String locatieCurenta;
	private ArrayList<FacebookAccount> prieteni = new ArrayList<FacebookAccount>();
	
	
	public FacebookAccount(String nume, int varsta, String locatieCurenta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.locatieCurenta = locatieCurenta;
	}
	
	public void listFriends() {
		for(FacebookAccount i: prieteni) {
			System.out.println(i.getNume());
		}
	}
		
	public void addFriend(FacebookAccount prieten) {
		this.prieteni.add(prieten);
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getLocatieCurenta() {
		return locatieCurenta;
	}
	public void setLocatieCurenta(String locatieCurenta) {
		this.locatieCurenta = locatieCurenta;
	}
	public ArrayList<FacebookAccount> getPrieteni() {
		return prieteni;
	}
	public void setPrieteni(ArrayList<FacebookAccount> prieteni) {
		this.prieteni = prieteni;
	}
	
	
	
	
}
