import java.util.Scanner;

	public class Para06 {

		private static Scanner scan;

		public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		
		int idade = 0;
		
		double peso = 0;
		double pesopessoa = 0;
		
		double media = 0;
		
		for (int npessoas = 1; npessoas <= 30; npessoas++){
			
			System.out.println("Informe a idade: ");
			idade = scan.nextInt();
			
			System.out.println("Informe o peso: ");
			pesopessoa = scan.nextDouble();
			
			media += idade;
			
			if (pesopessoa > 90)
				peso++;
			
			}
		
		media = media / 30;
		
		System.out.println("A quantidade de pessoas com peso acima de 90kg são: " + peso);
		System.out.println("A media das idades das pessoas são: " + media);
		
	}

}
