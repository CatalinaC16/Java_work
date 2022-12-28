package pb6_1;

public class Lucrator {
 
	
	private String nume;
	private CalendarLucru calendar;
	
	public Lucrator(String nume, CalendarLucru calendar) {
		super();
		this.nume = nume;
		this.calendar = calendar;
	}
	public void lucreaza(String zi) {
		
		try {
			
			if(calendar.lucra(zi)== false)
				throw new ExceptieZiNelucratoare("");
			System.out.println("Lucreaza in aceasta zi!");	
				
		}
		catch(ExceptieZiNelucratoare e){
			System.out.println("Nu lucreaza in ziua asta!");
		}
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public CalendarLucru getCalendar() {
		return calendar;
	}
	public void setCalendar(CalendarLucru calendar) {
		this.calendar = calendar;
	}
	
}
