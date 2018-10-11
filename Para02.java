import java.util.Scanner;

public class Para02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int feminino = 0;
		String sexo;
		int idade = 0;

		for (int npessoas = 1; npessoas <= 20; npessoas++) {

			System.out.println("Informe a idade da pessoa: ");
			idade = scan.nextInt();

			System.out.println("Informe o sexo M para MASCULINO e F para FEMININO: ");
			sexo = scan.next();

			if (sexo.equals("m") || sexo.equals("f")) {

				if (sexo.equals("f") && idade >= 20 && idade <= 40)
					feminino++;
			}

		}
		
		System.out.println("A quantidade de mulheres entre 20 e 40 anos são: " + feminino);
	}

}
