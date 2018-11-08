import java.util.Scanner;

public class Sequencial02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int x = 0;

		System.out.println("Digite um número negativo para saber seu valor positivo");
		// Informação que aparecerá para o usuário
		x = scan.nextInt();
		// Leia e armazene dentro da variável

		if (x <= 0) {
			System.out.println(-x);
			// Leia o numero e multiplique para que fique negativo
		} else {
			System.out.println("Deve ser um numero negativo");
		}
	}

}
