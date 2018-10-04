import java.util.Scanner;

public class Enquanto5 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double canal4 = 0;
		double canal5 = 0;
		double canal7 = 0;
		double canal12 = 0;

		double npessoas4 = 0;
		double npessoas5 = 0;
		double npessoas7 = 0;
		double npessoas12 = 0;

		int npessoas = 0;
		int pessoas = 0;
		int canal = 1;

		while (canal != 0) {

			System.out.println("Informe o canal em que a pessoa assiste: ");
			canal = scan.nextInt();

			if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {

				System.out.println("Informe quantas pessoas da casa estão assistindo o canal informado: ");
				pessoas = scan.nextInt();

				npessoas += pessoas;

				if (canal == 4 && pessoas > 0) {
					canal4 += pessoas;
					sistema("4");
					
				} else if (canal == 5) {
					canal5 += pessoas;
					sistema("5");

				} else if (canal == 7) {
					canal7 += pessoas;
					sistema("7");

				} else if (canal == 12) {
					canal12 += pessoas;
					sistema("12");

				}

				npessoas4 = canal4 / npessoas * 100;
				npessoas5 = canal5 / npessoas * 100;
				npessoas7 = canal7 / npessoas * 100;
				npessoas12 = canal12 / npessoas * 100;

				System.out.println("A porcentagem de audiência do canal 4 é: " + npessoas4);
				System.out.println("A porcentagem de audiência do canal 5 é: " + npessoas5);
				System.out.println("A porcentagem de audiência do canal 7 é: " + npessoas7);
				System.out.println("A porcentagem de audiência do canal 12 é: " + npessoas12);

				System.out.println("---------------------------------------");
			}

		}
		
		System.out.println("Programa finalizado. ");
	}
	
	static double porcentagem(double total, double valor){
		double percent = total / valor * 100;
		
		return percent;
		
	}
	
	static void sistema(String canal){
		System.out.println("A quantidade de pessoas que assistem o canal "+ canal);
	}

}
