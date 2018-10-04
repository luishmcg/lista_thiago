import java.util.Scanner;

public class Enquanto1{

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int somaS = 0;
		int somaF = 0;
		
		int salario = 0;
		int filhos = 0;
		
		int cont = 0;
		
		while (salario >= 0){
			
			System.out.println("Digite o salario");
			salario = scan.nextInt();	
			System.out.println("Digite o numero de filhos");
			filhos = scan.nextInt();
			
			if (salario >= 0) {
				
				somaS += salario;
				somaF += filhos;
				cont++; 
			}
		
		}

		System.out.println("Media do salario é: " + (somaS / cont));
		System.out.println("Media de filhos é: " + (somaF / cont));
	}

}

