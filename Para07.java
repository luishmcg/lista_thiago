import java.util.Scanner;

public class Para07 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int votos = 0;

		double quantidadevotos1 = 0;
		double quantidadevotos2 = 0;
		double quantidadevotos3 = 0;
		double quantidadevotos4 = 0;

		double quantidadenulos = 0;
		double quantidadebrancos = 0;

		double porcentagemvotos1 = 0;
		double porcentagemvotos2 = 0;
		double porcentagemvotos3 = 0;
		double porcentagemvotos4 = 0;

		double porcentagemnulos = 0;
		double porcentagembrancos = 0;

		for (int pessoas = 1; pessoas <= 1000; pessoas++) {

			System.out.println("Digite o número do candidato escolhido: ");
			votos = scan.nextInt();

			if (votos == 0 || votos == 1 || votos == 10 || votos == 20 || votos == 30 || votos == 40) {

				if (votos == 0)
					quantidadenulos++;

				else if (votos == 1)
					quantidadebrancos++;

				else if (votos == 10)
					quantidadevotos1++;

				else if (votos == 20)
					quantidadevotos2++;

				else if (votos == 30)
					quantidadevotos3++;

				else if (votos == 40)
					quantidadevotos4++;

			}
		}
		
		porcentagemvotos1 = quantidadevotos1 / 1000 * 100;
		porcentagemvotos2 = quantidadevotos2 / 1000 * 100;
		porcentagemvotos3 = quantidadevotos3 / 1000 * 100;
		porcentagemvotos4 = quantidadevotos4 / 1000 * 100;
		porcentagemnulos = quantidadenulos / 1000 * 100;
		porcentagembrancos = quantidadebrancos / 1000 * 100;
		
		
		System.out.println("O candidato 1 recebeu: " + quantidadevotos1 + " votos.");
		System.out.println("O candidato 2 recebeu: " + quantidadevotos2 + " votos.");
		System.out.println("O candidato 3 recebeu: " + quantidadevotos3 + " votos.");
		System.out.println("O candidato 4 recebeu: " + quantidadevotos4 + " votos.");
	
		System.out.println("A quantidade de votos em branco foram: " + quantidadebrancos + " votos.");
		System.out.println("A quantidade de votos nulos foram: " + quantidadenulos + " votos.");
		
		System.out.println("A porcentagem de votos do candidato 1 foi: " + porcentagemvotos1 + "%");
		System.out.println("A porcentagem de votos do candidato 2 foi: " + porcentagemvotos2 + "%");
		System.out.println("A porcentagem de votos do candidato 3 foi: " + porcentagemvotos3 + "%");
		System.out.println("A porcentagem de votos do candidato 4 foi: " + porcentagemvotos4 + "%");
		
		System.out.println("A porcentagem de votos em branco foram: " + porcentagembrancos + "%");
		System.out.println("A porcentagem de votos nulos foram: " + porcentagemnulos + "%");

	}
}
