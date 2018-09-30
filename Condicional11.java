import java.util.Scanner;

public class Condicional11 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double peso = 0;
		double altura = 0;
		double imc = 0;
		// declarado double em caso de numeros decimais

		System.out.println("Para saber o IMC, informe o peso: ");
		peso = scan.nextDouble();
		// leitura do sistema e armazenar variavel
		
		System.out.println("Agora informe a altura: ");
		altura = scan.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		//formula do imc
		
		if (imc  < 20){
			System.out.println("Abaixo do peso. " + imc);
		
		}else if (imc > 20 && imc < 25){
			System.out.println("Peso normal. " + imc);
		
		}else if (imc > 25 && imc < 30){
			System.out.println("Sobre peso. " + imc);
		
		}else if (imc > 30 && imc < 40){
			System.out.println("Obeso. " + imc);
			
		}else {
			System.out.println("Obeso mórbido. " + imc);
			
		//acima são confirmaçoes para identificar como está a pessoa / apresentar resultado
			
		}

	}
}
