import java.util.Scanner;

public class Condicional09 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double x = 0;
		double y = 0;
		double z = 0;
		// declarado double em caso de numeros decimais

		System.out.println("Para saber se os comprimentos formam um triangulo, digite o primeiro lado: ");
		x = scan.nextDouble();
		// leitura do sistema e armazenar variavel

		System.out.println("Agora informe o segundo lado: ");
		y = scan.nextDouble();

		System.out.println("Por ultimo informe o terceiro lado: ");
		z = scan.nextDouble();

		if (x < y + z && y < x + z && z < y + x){
		//confirmaçao se formará um triangulo
			
			System.out.println("Estes dados formam um triângulo!! ");
			//aprensentaçao do resultado
		}
		
		else {
		
			System.out.println("Não é possivel formar um triangulo. ");
			//aprensentaçao do resultado
			
		}

	}
}
