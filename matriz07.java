import java.util.Scanner;

public class matriz07 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[][] matriz = new double[4][4];

		double[] vetor = new double[4];
		
		int maior = 0;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.println("Digite um conjunto de numeros para preencher a matriz: ");
				matriz[i][j] = scan.nextInt();

			}
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				if (matriz[i][j] > maior)

					vetor[i] = matriz[i][j];

			}
		}

		System.out.println("O maior número de cada linha são: ");

		for (int i = 0; i < 4; i++) {

			System.out.println(vetor[i]);

		}

	}

}
