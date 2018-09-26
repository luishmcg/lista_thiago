import java.util.Scanner;

	public class Sequencial06 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double smin = 0;
		double salario = 0;
		double nsmin = 0;
		
		System.out.println("Para calcular quantos salários minimos equivale o seu salário, informe primeiro o salario mínimo: ");
		smin = scan.nextDouble();
		System.out.println("Salário minimo é: " + smin);
		
		System.out.println("Agora informe o seu salário: ");
		salario = scan.nextDouble();

		 nsmin = salario / smin;
		
		 System.out.println("O seu salário são : " + nsmin + " vezes" + " o salário mínimo");
		 
	}

}
