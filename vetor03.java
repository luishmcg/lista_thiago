import java.util.Scanner;

public class vetor03 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor = new double[10];
		double maior = 0;
		double menor = 100;
		int i;
		int indice = 0;

		for (i = 0; i <= 9; i++) {

			System.out.println("Informe o n�mero: ");
			vetor[i] = scan.nextDouble();

		}

		for (i = 0; i <= 9; i++) {

			if (vetor[i] > maior){
				maior = vetor[i];
				indice = i;
			}
		}

		System.out
				.println("O maior n�mero �: " + maior + " e o �ndice �: " + indice);

		for (i = 0; i <= 9; i++) {

			if (vetor[i] < menor) {
				menor = vetor[i];
				indice = i;
			}
		}

		System.out
				.println("O menor n�mero �: " + menor + " e o �ndice �: " + indice);

	}

}
