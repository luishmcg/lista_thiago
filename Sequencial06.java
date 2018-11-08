import java.util.Scanner;

public class Sequencial06 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double smin = 0;
		double salario = 0;
		double nsmin = 0;
		// double pois o número pode conter casa decimal

		System.out.println("Para calcular quantos salários minimos equivale o seu salário, informe primeiro o salario mínimo: ");
		smin = scan.nextDouble();
		// Leia e armazene dentro da variável
		System.out.println("Salário minimo é: " + smin);
		// Informação que aparecerá para o usuário

		System.out.println("Agora informe o seu salário: ");
		salario = scan.nextDouble();

		nsmin = salario / smin;
		// calculo

		System.out.println("O seu salário são : " + nsmin + " vezes o salário mínimo");
		//resultado para o cliente

	}

}
