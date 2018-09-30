import java.util.Scanner;

public class Condiciona15 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int idade = 0;
		int idade1 = 0;
		int idade2 = 0;
		int idade3 = 0;
		int idade4 = 0;
		
		int dif = 0;
		int dif1 = 0;
		int dif2 = 0;
		int dif3 = 0;
		int dif4 = 0;
		
		int media = 0;
		//declaraçao de variaveis
		
		System.out.println("Vamos calcular a media de idade de sua familia e apresentar a pessoa com idade mais proxima da media, vamos começar, digite a primeira idade: ");
		idade = scan.nextInt();
		
		System.out.println("A segunda idade: ");
		idade1 = scan.nextInt();
		
		System.out.println("A terceira idade: ");
		idade2 = scan.nextInt();
		
		System.out.println("A quarta idade: ");
		idade3 = scan.nextInt();
		
		System.out.println("A quinta idade: ");
		idade4 = scan.nextInt();
		// solicitar dados ao usuario e armazenar no sistema
		
		media = (idade + idade1 + idade2 + idade3 + idade4) / 5;
		//calculo para a media
		
		dif = Math.abs(idade - media);
		dif1 = Math.abs(idade1 - media);
		dif2 = Math.abs(idade2 - media);
		dif3 = Math.abs(idade3 - media);
		dif4 = Math.abs(idade4 - media); 
		// utilizando este calculo a qual é a diferença mais proxima
		
		
		if (dif < dif1 && dif < dif2 && dif < dif3 && dif < dif4) {
			
			System.out.println("A media de idade da família é: " + media + " e a idade mais proxima a media é: " + idade);
		
		}else if (dif1 < dif && dif1 < dif2 && dif1 < dif3 && dif1 < dif4){
			
			System.out.println("A media de idade da família é: " + media + " e a idade mais proxima a media é: " + idade1);
		
		}else if (dif2 < dif && dif2 < dif1 && dif2 < dif3 && dif2 < dif4){
			
			System.out.println("A media de idade da família é: " + media + " e a idade mais proxima a media é: " + idade2);
		
		}else if (dif3 < dif && dif3 < dif1 && dif3 < dif2 && dif3 < dif4){
			
			System.out.println("A media de idade da família é: " + media + " e a idade mais proxima a media é: " + idade3);
		
		}else if (dif4 < dif && dif4 < dif1 && dif4 < dif2 && dif4 < dif3){
			
			System.out.println("A media de idade da família é: " + media + " e a idade mais proxima a media é: " + idade4);
			//acima é a verificaçao para encontrar a diferença mais proxima
		
		}else {
			
			System.out.println("Ocorreu um erro. ");
		}
		
	}

}
