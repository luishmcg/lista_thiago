import java.util.Scanner;

public class Sequencial04 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double c = 0;
		double f = 0;
		//double pois o n�mero pode conter casa decimal

		System.out.println("Para saber a temperatura em Celsius somente informar os graus: ");
		// Informa��o que aparecer� para o usu�rio
		c = scan.nextInt();
		// Leia e armazene dentro da vari�vel

		f = (c * 1.8) + 32;

		System.out.println("O valor em Fahrenheit �: " + f);

	}

}
