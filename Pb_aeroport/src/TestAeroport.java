
public class TestAeroport {

	public static void main(String[] args) {
		
		Aeroport aeroport = new Aeroport();
		AvionPasageri a1 = new AvionPasageri("A1", "george", 400, Pozitie.NEUTRU,10);
		AvionMilitar a2 = new AvionMilitar("M2","cata", 900, Pozitie.NEUTRU,3);
		Elicopter a3 = new Elicopter("E3","Cristi",500, Pozitie.NEUTRU,2);
		aeroport.addAeronava(a3);
		aeroport.addAeronava(a2);
		aeroport.addAeronava(a1);
		System.out.println(aeroport);
		
		Pasager om1 = new Pasager("ion",39);
		Pasager om2 = new Pasager("gia",34);
		Pasager om3 = new Pasager("mia",22);
		a1.addPasager(om3);
		a1.addPasager(om2);
		a1.addPasager(om1);
		System.out.println("\n"+aeroport);
		a1.debarcPasager(om3);
		System.out.println("\n"+aeroport);
		
		Echipament e1 = new Echipament("23nn");
		Echipament e2 = new Echipament("26hnn");
		Echipament e3 = new Echipament("55n");
		
		a2.addEchipament(e1);
		a2.addEchipament(e2);
		a2.addEchipament(e3);
		
		System.out.println("\n"+aeroport);
		a3.mesajSonor("SMURD");
		
		a2.stareActuala("decolare");
		aeroport.delAeronava(a2);
		
		System.out.println("\n"+aeroport);
	}

}
