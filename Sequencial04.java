import java.util.Scanner;

public class Sequencial04 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double c = 0;
		double f = 0;
		//double pois o número pode conter casa decimal

		System.out.println("Para saber a temperatura em Celsius somente informar os graus: ");
		// Informação que aparecerá para o usuário
		c = scan.nextInt();
		// Leia e armazene dentro da variável

		f = (c * 1.8) + 32;

		System.out.println("O valor em Fahrenheit é: " + f);

	}

}
