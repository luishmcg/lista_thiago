import java.util.Scanner;

public class matriz03 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		
		int[][] matriz = new int[2][3];
		

		int maiorN = 0;
		int menorN = 1000;
		
		int linhaM = 0;
		int colunaM = 0;
		
		int linhaMe = 0;
		int colunaMe = 0;
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.println("Digite um conjunto de numeros para preencher a matriz");
				matriz[i][j] = scan.nextInt();
					
			}
		}
		
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if (matriz[i][j] > maiorN) {
					
					maiorN = matriz[i][j];
				
					linhaM = i;
					colunaM = j;
				}
				if (matriz[i][j] < menorN) {
					
					menorN = matriz[i][j];
				
					linhaMe = i;
					colunaMe = j;
				}
			}
		}
		
		
		System.out.println("O maior n�mero �: " + maiorN + " sua linha �: " + linhaM + " e sua coluna �: " + colunaM);
		System.out.println("O menor n�mero �: " + menorN + " sua linha �: " + linhaMe + " e sua coluna �: " + colunaMe);
		
	}

}
