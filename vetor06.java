import java.util.Scanner;

public class vetor06 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[] vetor1 = new double[10];
		double[] vetor2 = new double[10];
		double[] vetor3 = new double[10];
		double[] vetor4 = new double[10];
		

		for (int i = 0; i <= 9; i++) {

			System.out.println("Digite o n�mero para o vetor 1");
			vetor1[i] = scan.nextInt();
		}
		
		for (int i = 0; i <= 9; i++) {

			System.out.println("Digite o n�mero para o vetor 2");
			vetor2[i] = scan.nextInt();
		}
		
		for (int i = 0; i <= 9; i++) {

				vetor3[i] = vetor1[i] * vetor2[i];
				
				vetor4[i] = vetor1[i] / vetor2[i];

		}
		
		System.out.println("Os n�meros do primeiro vetor s�o: ");
		for (int i = 0; i <= 9; i++){
			
			System.out.println(vetor1[i]);
			
		}
		
		System.out.println("Os n�meros do segundo vetor s�o: ");
		for (int i = 0; i <= 9; i++){
			
			System.out.println(vetor2[i]);
			
		}
		
		System.out.println("Os n�meros do terceiro vetor s�o: ");
		for (int i = 0; i <= 9; i++){
			
			System.out.println(vetor3[i]);
			
		}
		
		System.out.println("Os n�meros do quarto vetor s�o: ");
		for (int i = 0; i <= 9; i++){
			
			System.out.println(vetor4[i]);
			
		}
		
	}

}
