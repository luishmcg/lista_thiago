import java.util.Scanner;

public class matriz05 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		int operacao = 0;
		int numC = 0;
		int numL = 0;

		int somaC = 0;
		int somaL = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println("Digite um conjunto de numeros para preencher a matriz");
				matriz[i][j] = scan.nextInt();

			}
		}

		System.out.println("Caro usuário, deseja realizar uma operação com coluna digite 1 ou com linha digite 2: ");
		operacao = scan.nextInt();

		if (operacao == 1) {

			System.out.println("Caro usuário, agora informe o número da coluna de (1 a 3): ");
			numC = scan.nextInt();

			System.out.println("Os números pertencentes a coluna escolhida são: ");

			if (numC == 1)

				for (int i = 0; i < 3; i++) {

					somaC += matriz[i][0];

					System.out.println(matriz[i][0]);

				}

			if (numC == 2)

				for (int i = 0; i < 3; i++) {

					somaC += matriz[i][1];

					System.out.println(matriz[i][1]);

				}

			if (numC == 3)

				for (int i = 0; i < 3; i++) {

					somaC += matriz[i][2];

					System.out.println(matriz[i][2]);

				}

			System.out.println("A soma da coluna é: " + somaC);
		}

		if (operacao == 2) {

			System.out.println("Caro usuário, agora informe o número da linha de (1 a 3): ");
			numL = scan.nextInt();

			System.out.println("Os números pertencentes a linha escolhida são: ");

			if (numL == 1)

				for (int j = 0; j < 3; j++) {

					somaL += matriz[0][j];

					System.out.println(matriz[0][j]);

				}

			if (numL == 2)

				for (int j = 0; j < 3; j++) {

					somaL += matriz[1][j];

					System.out.println(matriz[1][j]);

				}

			if (numL == 3)

				for (int j = 0; j < 3; j++) {

					somaL += matriz[2][j];

					System.out.println(matriz[2][j]);

				}

			System.out.println("A soma da coluna é: " + somaL);

		}

	}
}
