import java.util.Scanner;

public class Para01 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		double peso = 0;
		int mulheres = 0;
		int homens = 0;
		String sexo;
		
		for (int npessoas = 1; npessoas <= 10; npessoas++) {
		
		System.out.println("Informe o sexo M para MASCULINO e F para FEMININO");
		sexo = scan.next();
		
		if (sexo.equals("m") || sexo.equals("f")) {
			
			System.out.println("Informe o peso");
			peso = scan.nextDouble();
			
			if (sexo.equals("m") && peso >= 60 && peso <= 80)
				homens++;
			
			else if (sexo.equals("f") && peso >= 50 && peso <= 70)
				mulheres++;
			
		}
		
		else 
			System.out.println("O IMBECIL, digita o sexo correto, desde ja, agradeço. ");
		
		}
		
		System.out.println("A quantidade de homens entre 60 e 80 kg são: " + homens);
		System.out.println("A quantidade de mulheres entre 50 e 70kg são: " + mulheres);
	}

}
