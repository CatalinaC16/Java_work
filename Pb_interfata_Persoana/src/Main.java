import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Persoana[] persoane = new Persoana[4];
	
		persoane[0]=new Persoana("Cio","Ion",44);
		persoane[1]=new Persoana("Geo","Ionel",43);
		persoane[2]=new Persoana("Alb","Geo",55);
		persoane[3]=new Persoana("Alb","Geo",59);
		
		Arrays.sort(persoane);
		
		System.out.println(Arrays.toString(persoane));
			
	}

}
