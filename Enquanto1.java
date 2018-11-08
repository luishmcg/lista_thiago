import java.util.Scanner;

public class Enquanto1 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int somaS = 0;
		int somaF = 0;

		int salario = 0;
		int filhos = 0;

		int cont = 0;

		while (salario >= 0) {
			// acima será o momento em que o sistema irá parar
			// abaixo é para coletar informações
			System.out.println("Digite o salario");
			salario = scan.nextInt();

			if (salario >= 0) {

				System.out.println("Digite o numero de filhos");
				filhos = scan.nextInt();

				somaS += salario; // Acumular o salário de todas as pessoas
				somaF += filhos; // Acumular o numero de filhos
				cont++; // contador para saber a media
			}

		}

		System.out.println("Media do salario é: " + (somaS / cont));
		System.out.println("Media de filhos é: " + (somaF / cont));
	}

}
