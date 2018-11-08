import java.util.Scanner;

	public class Enquanto2 {
		
		private static Scanner scan;

		public static void main(String[] args) {
		scan = new Scanner(System.in);

		int matricula = 0;
		
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		
		double media = 0;
		
		while (matricula >= 0){
		
		// abaixo coleta de dados
		System.out.println("Informe a matricula: ");
		matricula = scan.nextInt();
		
		if (matricula >= 0){
			//uma matricula negativa o sistema encerra
		
		System.out.println("Informe a primeira nota: ");
		nota1 = scan.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = scan.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = scan.nextInt();
		
		
			media = (nota1 + nota2 + nota3) / 3;
			System.out.println(matricula);
			
			//abaixo para saber a onde o aluno se encaixa
			if (media >= 70){
				System.out.println("Aprovado " + media);
			}
			else if (media >= 60 && media < 70) {
				System.out.println("Exame " + media);
			}
			else {
				System.out.println("Reprovado " + media);
				
				}
			}
			
		}

		System.out.println("Programa finalizado. ");
		
	}

}
