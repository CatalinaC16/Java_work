
public class Ghiozdan {

	public static final int NR_MAX_RECHIZITE = 5;
	public int nr_rechizite_introduse;
	Rechizita[] lista = new Rechizita[NR_MAX_RECHIZITE];
	
	
	public void addCaiet(Caiet c){
		
		lista[nr_rechizite_introduse] = new Caiet(c.getEticheta());
		nr_rechizite_introduse ++;
	}
	
	public void addManual(Manual m){
			
		lista[nr_rechizite_introduse] = new Manual(m.getEticheta());
		nr_rechizite_introduse ++;
	}
	
	public void listRechizite() {
		
		for(Rechizita i: lista) { 
			
			System.out.println(i);
		}		
	}
	
	public void listCaiete() {
		
        for(Rechizita i : lista) { 
        	
			if(i instanceof Caiet)
				
				System.out.println(i);
		}
	}
	
	public void listManuale() {
		
		for(Rechizita i : lista) {
			
			if(i instanceof Manual)
				
				System.out.println(i);
		}
	}
	
	public int getNrRechizite(){	
		
		return nr_rechizite_introduse;
	}
	
	public int getNrCaiete() {
		int nr_caiete = 0;
		
		for(Rechizita i : lista) {
			
			if(i instanceof Caiet)
				
				nr_caiete++;
		}
		return nr_caiete;
	}
	
	public int getNrManuale() {
		int nr_manuale = 0;
		
		for(Rechizita i : lista) {
			
			if(i instanceof Manual) 
				
				nr_manuale++;
		}
		return nr_manuale;
	}
	
}
