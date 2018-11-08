import java.util.Scanner;

public class matriz02 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Digite um conjunto de numeros para visualizar a matriz");
			matriz[0][i] = scan.nextInt();
			
		}
		
		System.out.println("A coluna a ser apresentada: ");
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println(matriz[0][i]);
			
		}

	}

}
