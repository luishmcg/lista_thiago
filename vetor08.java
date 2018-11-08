import java.util.Scanner;

public class vetor08 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor1 = new double[10];
		double[] vetor2 = new double[5];
		double[] vetor3 = new double[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite (10) números: ");
			vetor1[i] = scan.nextDouble();
		}

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite (5) números para saber se estão entre os 10 primeiros: ");
			vetor2[i] = scan.nextDouble();

		}

		System.out.println("Os números dos (5) que são iguais aos dos (10) são: ");
	
		for (int i = 0; i < 10; i++) {

			if (vetor1[i] == vetor2[i])

				vetor3[i] = vetor2[i];

			if (vetor3[i] > 0)

			System.out.println(vetor3[i]);

		}
	}
}
