import java.util.Scanner;

public class Enquanto3 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int idade = 0;
		double peso = 0;
		String sexo;
		
		int homens = 0;
		int mulheres = 0;

		// por ser um metodo com limite, adicionei o for
		for (int npessoas = 1; npessoas <= 10; npessoas++) {
			
			//coleta de dados
			System.out.println("Digite M para sexo masculino e F para sexo Feminino: ");
			sexo = scan.next();
			
			// verificar se a pessoas digiou M ou F, caso contrario repetira a msg na tela
			if (sexo.equals("m") || sexo.equals("f")){

			System.out.println("Informe a idade: ");
			idade = scan.nextInt();

			System.out.println("Informe o peso: ");
			peso = scan.nextInt();

			// abaixo para saber a quantidade de pessoas estão dentro dos parametros
			if (sexo.equals("m")) {
				if (idade >= 20 && idade <= 30 && peso > 60) {

					System.out.println("A quantidade de homens entre 20 e 30 anos pesam mais de 60 kg são: " + ++homens);

				}
			}

			else if (sexo.equals("f")) {
				if (idade > 40 && peso < 70) {

					System.out.println("A quantidade de mulheres acima de 40 anos pesam menos de 70 kg são: " + ++mulheres);

				}
			}

			else {
				System.out.println("Continue a preencher os dados");
				}
			}
			
			else{
				npessoas--; // neste caso para que o contador não se engane ao digitar qualquer coisa,
							//adicionei este item para que obetenha o resultado esperado
			}
		}
		
	}
		
}