import java.util.Scanner;

public class Sequencial02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int x = 0;

		System.out.println("Digite um n�mero negativo para saber seu valor positivo");
		// Informa��o que aparecer� para o usu�rio
		x = scan.nextInt();
		// Leia e armazene dentro da vari�vel

		if (x <= 0) {
			System.out.println(-x);
			// Leia o numero e multiplique para que fique negativo
		} else {
			System.out.println("Deve ser um numero negativo");
		}
	}

}
