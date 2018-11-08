import java.util.Scanner;

public class vetor04 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor = new double[10];
		double[] vetorN = new double[10];
		double[] vetorP = new double[10];
		
		int i;
		
		for (i = 0; i <= 9; i++){
			
			System.out.println("Informe o número: ");
			vetor[i] = scan.nextDouble();
			
		}
		
		System.out.println("Vetor negativo: ");
				
		for (i = 0; i <= 9; i++){
			
			if (vetor[i] < 0)
				vetorN[i] = vetor[i];
			
			System.out.println(vetorN[i]);
			
		}
		
		System.out.println("Vetor positivo: ");
		
		for (i = 0; i <= 9; i++){
			
			if (vetor[i] > 0)
				vetorP[i] = vetor[i];
			
			System.out.println(vetorP[i]);
		
		}


		
	}

}
