import java.util.Scanner;

	public class Sequencial05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double peso = 0;
		double quinze = 0.15;
		double vinte = 0.20;

			System.out.println("Informe seu peso caso desejar saber o mesmo após engordar 15% e emagrecer 20%: ");
		peso = scan.nextDouble();
		
			System.out.println("Peso após engordar 15%: " + (peso + (peso * quinze)));
			System.out.println("Peso após emagrecer 20%: " + (peso - (peso * vinte)));		
	}

}
