import java.util.Scanner;

public class Sequencial05 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double peso = 0;
		double quinze = 0.15;
		double vinte = 0.20;
		//double pois o n�mero pode conter casa decimal

		System.out.println("Informe seu peso caso desejar saber o mesmo ap�s engordar 15% e emagrecer 20%: ");
		// Informa��o que aparecer� para o usu�rio
		peso = scan.nextDouble();
		// Leia e armazene dentro da vari�vel

		System.out.println("Peso ap�s engordar 15%: " + (peso + (peso * quinze)));
		System.out.println("Peso ap�s emagrecer 20%: " + (peso - (peso * vinte)));
		// calculo e resultado para o usuario
	}

}
