
public class TestTren {

 public static void main(String[] args) {
	 
		Tren tren = new Tren(5);
		Bilet bilet = new Bilet(34, 100) ;
		Adult a1 = new Adult("Popa","Andrei",bilet);
		Student s1 = new Student("Co","Cata",bilet,"utcn");
		Pasager p1 = new Pasager("CZ","Andrei",bilet);
		
		   tren.addPasager(a1);
		   tren.addPasager(s1);
		   tren.addPasager(p1);
	
		   System.out.println(tren+"\n");
		   tren.debarcPasager(a1);
		   System.out.println(tren);
}
}
