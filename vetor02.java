import java.util.Scanner;

public class vetor02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor = new double[10];
		int i;
		
		for (i = 0; i <= 9; i++){
			
			System.out.println("Informe um n�mero");
			vetor[i] = scan.nextDouble();
		}
		
		
		System.out.println("Os n�meros pares s�o: ");
		
		for (i = 0; i <= 9; i++){
			
			if (vetor[i] % 2 == 0)
				System.out.println(vetor[i]);
			}
		
		System.out.println("Os n�meros �mpares s�o: ");
		
		for (i = 0; i <= 9; i++){
			
			if (vetor[i] % 2 != 0)
				System.out.println(vetor[i]);
		}
		
		
	}

}
