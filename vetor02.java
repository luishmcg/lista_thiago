import java.util.Scanner;

public class vetor02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor = new double[10];
		int i;
		
		for (i = 0; i <= 9; i++){
			
			System.out.println("Informe um número");
			vetor[i] = scan.nextDouble();
		}
		
		
		System.out.println("Os números pares são: ");
		
		for (i = 0; i <= 9; i++){
			
			if (vetor[i] % 2 == 0)
				System.out.println(vetor[i]);
			}
		
		System.out.println("Os números ímpares são: ");
		
		for (i = 0; i <= 9; i++){
			
			if (vetor[i] % 2 != 0)
				System.out.println(vetor[i]);
		}
		
		
	}

}
