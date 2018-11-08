import java.util.Scanner;

public class Para05 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		double aluno1 = 0;
		double aluno2 = 0;
		double aluno3 = 0;
		double aluno4 = 0;
		double aluno5 = 0;

		double maiornota1 = 0;
		double maiornota2 = 0;
		double maiornota3 = 0;
		double maiornota4 = 0;
		double maiornota5 = 0;

		double menornota1 = 100;
		double menornota2 = 100;
		double menornota3 = 100;
		double menornota4 = 100;
		double menornota5 = 100;

		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;

		for (int aluno = 1; aluno <= 5; aluno++) {

				System.out.println("Informe a primeira nota do aluno: ");
				nota1 = scan.nextDouble();
				
				System.out.println("Informe a segunda nota do aluno: ");
				nota2 = scan.nextDouble();
				
				System.out.println("Informe a terceira nota do aluno: ");
				nota3 = scan.nextDouble();
				

				if (aluno1 == 0) {

					if (maiornota1 < nota1)
						maiornota1 = nota1;
					
					if (maiornota1 < nota2)
						maiornota1 = nota2;
					
					if (maiornota1 < nota3)
						maiornota1 = nota3;
						
					if (menornota1 > nota1)
						menornota1 = nota1;
					
					if (menornota1 > nota2)
						menornota1 = nota2;
					
					if (menornota1 > nota3)
						menornota1 = nota3;

					aluno1++;
				}

				else if (aluno2 == 0) {

					if (maiornota2 < nota1)
						maiornota2 = nota1;
					
					if (maiornota2 < nota2)
						maiornota2 = nota2;
					
					if (maiornota2 < nota3)
						maiornota2 = nota3;
						
					if (menornota2 > nota1)
						menornota2 = nota1;
					
					if (menornota2 > nota2)
						menornota2 = nota2;
					
					if (menornota2 > nota3)
						menornota2 = nota3;

					aluno2++;
				}

				else if (aluno3 == 0) {

					if (maiornota3 < nota1)
						maiornota3 = nota1;
					
					if (maiornota3 < nota2)
						maiornota3 = nota2;
					
					if (maiornota3 < nota3)
						maiornota3 = nota3;
						
					if (menornota3 > nota1)
						menornota3 = nota1;
					
					if (menornota3 > nota2)
						menornota3 = nota2;
					
					if (menornota3 > nota3)
						menornota3 = nota3;
					aluno3++;
				}

				else if (aluno4 == 0) {

					if (maiornota4 < nota1)
						maiornota4 = nota1;
					
					if (maiornota4 < nota2)
						maiornota4 = nota2;
					
					if (maiornota4 < nota3)
						maiornota4 = nota3;
						
					if (menornota4 > nota1)
						menornota4 = nota1;
					
					if (menornota4 > nota2)
						menornota4 = nota2;
					
					if (menornota4 > nota3)
						menornota4 = nota3;

					aluno4++;
				}

				else if (aluno5 == 0) {

					if (maiornota5 < nota1)
						maiornota5 = nota1;
					
					if (maiornota5 < nota2)
						maiornota5 = nota2;
					
					if (maiornota5 < nota3)
						maiornota5 = nota3;
						
					if (menornota5 > nota1)
						menornota5 = nota1;
					
					if (menornota5 > nota2)
						menornota5 = nota2;
					
					if (menornota5 > nota3)
						menornota5 = nota3;
					
					aluno5++;
				}
			}

	System.out.println("A maior nota do primeiro aluno é: " + maiornota1 + " e a menor nota é: " + menornota1);
	System.out.println("A maior nota do segundo aluno é: " + maiornota2 + " e a menor nota é: " + menornota2);
	System.out.println("A maior nota do terceiro aluno é: " + maiornota3 + " e a menor nota é: " + menornota3);
	System.out.println("A maior nota do quarto aluno é: " + maiornota4 + " e a menor nota é: " + menornota4);
	System.out.println("A maior nota do quinto aluno é: " + maiornota5 + " e a menor nota é: " + menornota5);

	}

}
