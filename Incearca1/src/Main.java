import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Incearca in = new Incearca("Ana");
			System.out.println(in.getAge());
			Class in2 = in.getClass();
			System.out.println(in2.getName());
			
			Scanner scanner = new Scanner(System.in);
			double nr = scanner.nextDouble();
			int nr1 = scanner.nextInt();
			scanner.nextLine();
			String nume = scanner.nextLine();
			String prenume = scanner.nextLine();
			System.out.println(nume+nr);
			System.out.println(prenume+nr1);
	}

}
