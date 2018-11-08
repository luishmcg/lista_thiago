import java.util.Scanner;

public class matriz04 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		
		int[][] matriz = new int[3][5];
		
		int elementos = 0;

		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				System.out.println("Digite um conjunto de numeros para preencher a matriz");
				matriz[i][j] = scan.nextInt();
					
			}
		}
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if (matriz[i][j] > 15 && matriz[i][j] < 20)
					
					elementos++;
					
			}
		}
		
		System.out.println("A quantidade de elementos maior que 15 e menor que 20 são: " + elementos);
		
	}

}
