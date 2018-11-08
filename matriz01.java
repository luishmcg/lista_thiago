import java.util.Scanner;

public class matriz01 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Digite um conjunto de numeros para visualizar a matriz");
			matriz[i][0] = scan.nextInt();
			
		}
		
		System.out.println("A linha a ser apresentada: ");
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println(matriz[i][0]);
			
		}

	}

}
