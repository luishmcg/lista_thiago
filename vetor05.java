import java.util.Scanner;

public class vetor05 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int[] vetor = new int[10];
		
		int i;
		int posicao = 0;

		boolean procurarNumero = true;
		boolean numeroEncontrado;

		int verificacao = 0;
		int continuar = 0;

		for (i = 0; i <= 9; i++) {

			System.out.println("Informe um n�mero: ");
			vetor[i] = scan.nextInt();
		}

		while (verificacao >= 0) {

			System.out.println("Informe um novo n�mero para a verifica��o: ");
			verificacao = scan.nextInt();
			numeroEncontrado = false;

				for (i = 0; i <= 9; i++) {

					if (verificacao == vetor[i]){
					
					posicao = i + 1;
					numeroEncontrado = true;
						}
					}
					
				if (numeroEncontrado = true)

					System.out.println("Este n�mero " + verificacao + " possui no sistema e a posi��o dele �: " + posicao);

				else if (numeroEncontrado = false)

					System.out.println("Este n�mero n�o possui no sistema..");
				
				
				System.out.println("Deseja realizar uma nova pesquisa? Sim digite - 1, n�o digite - 2. ");
				continuar = scan.nextInt();

				if (continuar == 1)
					procurarNumero = true;

				else
					procurarNumero = false;
			}
		}

	}


