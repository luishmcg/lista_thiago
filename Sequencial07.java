import java.util.Scanner;

public class Sequencial07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dia = 0;
		int mes = 0;
		int ano = 0;

		int dia1 = 0;
		int mes1 = 0;
		int ano1 = 0;

		int dia2 = 0;
		int mes2 = 0;
		int ano2 = 0;

		int diasvividos = 0;

		System.out.println("Informe o dia de nascimento: ");
		dia = scan.nextInt();
		System.out.println("Informe o mes de nascimento: ");
		mes = scan.nextInt();
		System.out.println("Informe o ano de nascimento: ");
		ano = scan.nextInt();

		System.out.println("Agora informe o dia atual");
		dia1 = scan.nextInt();
		System.out.println("Agora informe o mes atual");
		mes1 = scan.nextInt();
		System.out.println("Agora informe o ano atual");
		ano1 = scan.nextInt();

		if (ano <= ano1) {
			ano2 = ano1 - ano;
			ano2 = ano2 * 365;
		}
		if (mes <= mes1) {
			mes2 = mes1 + mes;
			mes2 = mes2 - 12;
			mes2 = mes2 * 30;
		}
		if (dia <= dia1) {
			dia2 = dia1 - dia;
		} else {

			if (ano > ano1) {
				System.out
						.println("O ano de nascimento não pode ser maior que o ano atual");
			}
			if (dia > dia1) {
				dia2 = dia - dia1;
			}

		}
		
		diasvividos = dia2 + mes2 + ano2;

		System.out.println("Os dias vividos são aproximadamente: " + diasvividos);

	}

}
