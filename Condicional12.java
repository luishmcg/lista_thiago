import java.util.Scanner;


public class Condicional12 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int diaria = 0;
		int dia = 50;

		double total = 0;
		double taxa = 0;
		// por taxa possuir casas decimais aplicicado o double tanto nela quanto em total
		
		System.out.println("Informe o número de diárias do cliente: ");
		diaria = scan.nextInt();
		// leitura do sistema e armazenar variavel
		
		total = diaria * dia;
		//formula para calculo total
		
		if (diaria < 15){
			taxa = diaria * 1.5;
			total = total + taxa;
			
		}else if (diaria == 15){
			taxa = diaria * 1;
			total = total + taxa;
		
		}else if(diaria > 15){
			taxa = diaria * 0.5;
			total = total + taxa;
			
			// acima aplicação da taxa
			
		}else{
			System.out.println("Dados errado. ");
		}
		
		System.out.println("O total a ser pago é: " + total);
		//aprensentaçao do resultado
	}
}