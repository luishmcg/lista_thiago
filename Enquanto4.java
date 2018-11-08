import java.util.Scanner;


public class Enquanto4 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		
	int kg = 0;
	int npessoas = 0;
	int kg1 = 0;
	int resto = 0;
	
		// adicionei um limite como exemplo
		while (kg1 <= 500){
			System.out.println("Informe seu peso: ");
			kg = scan.nextInt();
			
			// neste caso será para a verificação
			kg1 += kg;
			
			if (kg <= 500){
				System.out.println("O número de pessoas é: " + ++npessoas + ", e o peso total é: " + kg1);
							
			}
		}
		
		// informar a quantidade de peso excedida
		resto = kg1 - 500;
		
		System.out.println("Limite de peso excedido, para que o elevador suba ou desça, é preciso que uma pessoa de: " + resto +  "kg , retire-se. ");
	}
}