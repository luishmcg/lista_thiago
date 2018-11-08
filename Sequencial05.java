import java.util.Scanner;

public class Sequencial05 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double peso = 0;
		double quinze = 0.15;
		double vinte = 0.20;
		//double pois o número pode conter casa decimal

		System.out.println("Informe seu peso caso desejar saber o mesmo após engordar 15% e emagrecer 20%: ");
		// Informação que aparecerá para o usuário
		peso = scan.nextDouble();
		// Leia e armazene dentro da variável

		System.out.println("Peso após engordar 15%: " + (peso + (peso * quinze)));
		System.out.println("Peso após emagrecer 20%: " + (peso - (peso * vinte)));
		// calculo e resultado para o usuario
	}

}
