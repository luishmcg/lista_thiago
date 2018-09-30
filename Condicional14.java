import java.util.Scanner;

public class Condicional14 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int apS = 100;
		int apS1 = 90;
		int apS2 = 80;
		
		int apD = 140;
		int apD1 = 120;
		int apD2 = 100;
		
		int diarias = 0;
		
		int total = 0;
		
		String apartamento;
		// declaradas variaveis com int, pois nada possui decimal e string para leitura do apartamento
		
		System.out.println("Para saber o valor total a ser pago, informe o tipo do apartamento s = simples ou d = duplo: ");
		apartamento = scan.next();
		// leitura do sistema e armazenar variavel
		
		System.out.println("Agora informe a quantidade de diarias: ");
		diarias = scan.nextInt();
		
		
		if (apartamento.equals("s")){
			//identificaçao do ap
			
			if (diarias < 10){
				total = diarias * apS;
				
			}else if (diarias <= 10 && diarias <= 15){
				total = diarias * apS1;
				
			}else {
				total = diarias * apS2;
				// calculos para verificar o valor final
			}
		}
		
		else if (apartamento.equals("d")){
			//identificaçao do ap
			
			if (diarias < 10){
				total = diarias * apD;
				
			}else if (diarias <= 10 && diarias <= 15){
				total = diarias * apD1;
				
			}else {
				total = diarias * apD2;		
				// calculos para verificar o valor final
			}
			
		}
		else{
			System.out.println("Dados informados, estão incorretos. ");
		}
		
		System.out.println("O valor total a ser pago são de: " + total);
		//aprensentaçao do resultado
	}

}
