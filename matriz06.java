import java.util.Scanner;

public class matriz06 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double[][] matriz = new double[3][3];
		
		double multiplicacao = 0;
		
		double[][] matrizResultante = new double[3][3];
		

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println("Digite um conjunto de numeros para preencher a matriz: ");
				matriz[i][j] = scan.nextInt();

			}
		}
		
		System.out.println("Digite um número que deseja multiplicar por todos os números da matriz: ");
		multiplicacao = scan.nextInt();
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				matrizResultante[i][j] = matriz[i][j] * multiplicacao;			

			}
		}
		
		System.out.println("O resultado da multiplicacao por cada elemento da matriz são: ");
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println(matrizResultante[i][j]);			

			}
		}
		
	}

}
