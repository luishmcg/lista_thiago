import java.util.Scanner;

public class Sequencial03 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int dm = 0;
		int dmn = 0;
		int area = 0;

		System.out.println("Para saber a area do losango, informe a digonal maior: ");
		// Informa��o que aparecer� para o usu�rio
		dm = scan.nextInt();
		// Leia e armazene dentro da vari�vel

		System.out.println("Agora informe a diagonal menor: ");
		dmn = scan.nextInt();

		area = (dm * dmn) / 2;

		System.out.println("A area do seu losango �: " + area);

	}

}
