import java.util.Scanner;

public class vetor01 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor = new double[10];
		double soma = 0;
		double media = 0;
		int i;

		for (i = 0; i <= 9; i++) {

			System.out.println("Informe o número");
			vetor[i] = scan.nextDouble();

			soma += vetor[i];
		}
		

		media = soma / vetor.length;
		
		System.out.println("A média é: " + media);

		System.out.println("Os números acima da média são: ");
		for (i = 0; i <= 9; i++) {

			if (vetor[i] > media)
				System.out.println(vetor[i]);
		}
		
		System.out.println("Os números abaixo da média são: ");
		for (i = 0; i <= 9; i++) {

			if (vetor[i] < media)
				System.out.println(vetor[i]);
		}
	}
}
