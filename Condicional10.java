import java.util.Scanner;

public class Condicional10 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int x = 0;
		//declara�ao de variavel

		System.out.println("Digite o c�digo do produto de 1 � 15: ");
		x = scan.nextInt();
		// leitura do sistema e armazenar variavel

		if (x == 1) {
			System.out.println("Alimento n�o-perecivel. ");
		
		} else if (x > 1 && x < 5) {
			System.out.println("Alimento perecivel. ");
		
		} else if (x > 4 && x < 7) {
			System.out.println("Vestu�rio. ");
		
		} else if (x == 7) {
			System.out.println("Higiene pessoal. ");
		
		} else if (x > 7 && x < 16) {
			System.out.println("Limpeza e utens�lios domestico. ");
			//acima s�o os parametros para a confirma�ao e apresenta�ao do resultado
		
		} else {

			System.out.println("Invalido. ");
			//aprensenta�ao do resultado
		}
	}
}