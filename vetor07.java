import java.util.Scanner;

public class vetor07 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		
		double[] vetor = new double[10];
		double[] alteracao = new double[10];
		
		
		for (int i = 0; i < 10; i++){
			
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextDouble();
		}
		
		System.out.println("Os vetores aletrados são: ");
		
		for (int i = 0; i < 10; i++){
				
			if (vetor[i] < 0) {
				
				alteracao[i] = i + 1;

				vetor[i] = 0;

			}
			
			if (alteracao[i] > 0)
				
			System.out.println(alteracao[i]);

		}
	}

}
