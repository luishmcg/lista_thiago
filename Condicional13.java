import java.util.Scanner;


public class Condicional13 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int hmensal = 60;
		int hmensal1 = 75;
		int hmensal2 = 90;
		int hmensal3 = 85;
		int hmensal4 = 80;
		
		int mmensal = 60;
		int mmensal1 = 90;
		int mmensal2 = 85;
		int mmensal3 = 80;
		
		int mensalidade = 0;
		
		int idade = 0;
		String sexo;
		
		// declaradas variaveis com int, pois nada possui decimal e string para leitura da letra
		
		System.out.println("Para saber o valor, informe o sexo do cliente 'm ou f': ");
		sexo = scan.next();
		// leitura do sistema e armazenar variavel
		
		System.out.println("Agora informe a idade: ");
		idade = scan.nextInt();
		

		
		if(sexo.equals("m")){
			//identificaçao se for digitado M para Masculino
			
			if (idade <= 15){
				mensalidade = hmensal;
			
			}else if (idade >= 16 && idade <= 18){
				mensalidade = hmensal1;	
			
			}else if (idade >= 19 && idade <= 30){
				mensalidade = hmensal2; 
			
			}else if (idade >= 31 && idade <= 40){
				mensalidade = hmensal3;
		
			}else {
				mensalidade = hmensal4;
				//verificaçao para aprensetar o valor
			}
		}
			
		else if (sexo.equals("f")){
			//identificaçao se for digitado F para Feminino
			
			if (idade <= 18){
				mensalidade = mmensal;
			
			}else if (idade <= 19 && idade <= 25){
				mensalidade = mmensal1;
			
			}else if (idade <= 26 && idade <= 40){
				mensalidade = mmensal2;
				
			}else{
				mensalidade = mmensal3;
				//verificaçao para aprensetar o valor
			}
		}
		
		else {
			System.out.println("Algum dado foi apresentado incorretamente. ");
		}
		
		System.out.println("O valor da sua mensalidade será: " + mensalidade);
		//aprensentaçao do resultado
	}

}
