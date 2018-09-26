import java.util.Scanner;

	public class Sequencial04 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double c = 0;
		double f = 0;
		
		System.out.println("Para saber a temperatura em Celsius somente informar os graus: ");
		c = scan.nextInt();
		
		f = (c*1.8) + 32;
		
		System.out.println("O valor em Fahrenheit é: " + f);

	}

}
