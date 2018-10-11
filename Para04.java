import java.util.Scanner;

public class Para04 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int idade = 0;
		int idademaior = 0;
		int idademenor = 100;

		for (int pessoas = 1; pessoas <= 100; pessoas++) {

			System.out.println("Informe a idade das pessoas: ");
		idade = scan.nextInt();
		
			if (idademaior < idade)
				idademaior = idade;
		
			if (idademenor > idade)
				idademenor = idade;
			
		}
		
		System.out.println("A maior idade é: " + idademaior);
		System.out.println("A menor idade é: " + idademenor);
	}
}