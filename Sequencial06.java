import java.util.Scanner;

	public class Sequencial06 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double smin = 0;
		double salario = 0;
		double nsmin = 0;
		
		System.out.println("Para calcular quantos sal�rios minimos equivale o seu sal�rio, informe primeiro o salario m�nimo: ");
		smin = scan.nextDouble();
		System.out.println("Sal�rio minimo �: " + smin);
		
		System.out.println("Agora informe o seu sal�rio: ");
		salario = scan.nextDouble();

		 nsmin = salario / smin;
		
		 System.out.println("O seu sal�rio s�o : " + nsmin + " vezes" + " o sal�rio m�nimo");
		 
	}

}
