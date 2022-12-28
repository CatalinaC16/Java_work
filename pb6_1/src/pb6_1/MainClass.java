package pb6_1;

public class MainClass {

	public static void main(String[] args) {
		
		CalendarLucru calendar1 = new CalendarLucru(true,true,true,true,true,false,false);
		Lucrator l1 = new Lucrator("Ion",calendar1);
		
		l1.lucreaza("Sambata");

	}

}
