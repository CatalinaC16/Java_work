
public class TestGhiozdan {

	public static void main(String[] args) {
	

		Ghiozdan ghiozdan = new Ghiozdan();
		
		Caiet c1 = new Caiet("mate");
		Caiet c2 = new Caiet("info");
		Caiet c3 = new Caiet("engleza");
		Manual m1 = new Manual("infom");
		Manual m2= new Manual("englm");
		
		ghiozdan.addCaiet(c1);
		ghiozdan.addCaiet(c2);
		ghiozdan.addCaiet(c3);
		ghiozdan.addManual(m1);
		ghiozdan.addManual(m2);
		
		System.out.println("Numarul de rechizite din ghiozdan este "+ghiozdan.getNrRechizite());
		System.out.println("Numarul de caiete din ghiozdan este "+ghiozdan.getNrCaiete());
		System.out.println("Numarul de manuale din ghiozdan este "+ghiozdan.getNrManuale());
		System.out.println("\nLista rechizitelor este:\n");
		ghiozdan.listRechizite();
		System.out.println("\nLista caietelor este:\n");
		ghiozdan.listCaiete();
		System.out.println("\nLista manualelor este:\n");
		ghiozdan.listManuale();
		
		
	}

}
