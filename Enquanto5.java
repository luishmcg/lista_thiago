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
		
		// ao digitar 0 o programa encerra
		while (canal != 0) {

			System.out.println("Informe o canal em que a pessoa assiste: ");
			canal = scan.nextInt();

			// verifica��o de canais, se estar� certo ou n�o
			if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {

				System.out.println("Informe quantas pessoas da casa est�o assistindo o canal informado: ");
				pessoas = scan.nextInt();

				// formula para saber a quantidade de pessoas
				npessoas += pessoas;

				// armazenar a quantidade de pessoas em cada canal
				if (canal == 4 && pessoas > 0) {
					canal4 += pessoas;
					sistema("4 �: " + canal4);
					
				} else if (canal == 5) {
					canal5 += pessoas;
					sistema("5 �: " + canal5);

				} else if (canal == 7) {
					canal7 += pessoas;
					sistema("7 �: " + canal7);

				} else if (canal == 12) {
					canal12 += pessoas;
					sistema("12 �: " + canal12);

				}

				//calculo para saber a porcentagem
				npessoas4 = canal4 / npessoas * 100;
				npessoas5 = canal5 / npessoas * 100;
				npessoas7 = canal7 / npessoas * 100;
				npessoas12 = canal12 / npessoas * 100;
				
				// apresenta��o do resultado
				System.out.println("A porcentagem de audi�ncia do canal 4 �: " + npessoas4);
				System.out.println("A porcentagem de audi�ncia do canal 5 �: " + npessoas5);
				System.out.println("A porcentagem de audi�ncia do canal 7 �: " + npessoas7);
				System.out.println("A porcentagem de audi�ncia do canal 12 �: " + npessoas12);

				System.out.println("---------------------------------------");
			}

		}
		
		System.out.println("Programa finalizado. ");
	}
	
	//abaixo foi so uma brincadeira =D
	static double porcentagem(double total, double valor){
		double percent = total / valor * 100;
		
		return percent;
		
	}
	
	// aqui para n�o ter que ficar escrevendo a linha toda, utilize somente a palavra "sistema"
	static void sistema(String canal){
		System.out.println("A quantidade de pessoas que assistem o canal "+ canal);
	}

}
