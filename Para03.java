import java.util.Scanner;

public class Para03 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double nota5 = 0;

		double notatotal = 0;
		double media = 0;

		for (int alunos = 1; alunos <= 30; alunos++) {

			System.out.println("Informe a primeira nota do aluno: ");
			nota1 = scan.nextDouble();

			System.out.println("Informe a segunda nota do aluno: ");
			nota2 = scan.nextDouble();

			System.out.println("Informe a terceira nota do aluno: ");
			nota3 = scan.nextDouble();

			System.out.println("Informe a quarta nota do aluno: ");
			nota4 = scan.nextDouble();

			System.out.println("Informe a quinta nota do aluno: ");
			nota5 = scan.nextDouble();

			notatotal = nota1 + nota2 + nota3 + nota4 + nota5;
			media = notatotal / 5;

			System.out.println("A media do aluno é: " + media);
			System.out.println("Aperte qualquer numero e ENTER para prosseguir: ");
			nota1 = scan.nextDouble();
			

		}
		System.out.println("Notas de todos os alunos foram concluiídas. ");
	}
}
