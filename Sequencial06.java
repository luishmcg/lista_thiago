import java.util.Scanner;

public class Sequencial06 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double smin = 0;
		double salario = 0;
		double nsmin = 0;
		// double pois o n�mero pode conter casa decimal

		System.out.println("Para calcular quantos sal�rios minimos equivale o seu sal�rio, informe primeiro o salario m�nimo: ");
		smin = scan.nextDouble();
		// Leia e armazene dentro da vari�vel
		System.out.println("Sal�rio minimo �: " + smin);
		// Informa��o que aparecer� para o usu�rio

		System.out.println("Agora informe o seu sal�rio: ");
		salario = scan.nextDouble();

		nsmin = salario / smin;
		// calculo

		System.out.println("O seu sal�rio s�o : " + nsmin + " vezes o sal�rio m�nimo");
		//resultado para o cliente

	}

}
