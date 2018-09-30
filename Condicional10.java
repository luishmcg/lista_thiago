import java.util.Scanner;

public class Condicional10 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int x = 0;
		//declaraçao de variavel

		System.out.println("Digite o código do produto de 1 á 15: ");
		x = scan.nextInt();
		// leitura do sistema e armazenar variavel

		if (x == 1) {
			System.out.println("Alimento não-perecivel. ");
		
		} else if (x > 1 && x < 5) {
			System.out.println("Alimento perecivel. ");
		
		} else if (x > 4 && x < 7) {
			System.out.println("Vestuário. ");
		
		} else if (x == 7) {
			System.out.println("Higiene pessoal. ");
		
		} else if (x > 7 && x < 16) {
			System.out.println("Limpeza e utensílios domestico. ");
			//acima são os parametros para a confirmaçao e apresentaçao do resultado
		
		} else {

			System.out.println("Invalido. ");
			//aprensentaçao do resultado
		}
	}
}