import java.util.Scanner;

	public class Enquanto6 {

		private static Scanner scan;

		public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		double notafinal= 1;
		double maiornota = 0;
		double menornota = 100;
		double medianotas = 0;
		
		int totalfaltas = 0;

		int conjuntoalunos = 0;
		int totalalunos = 0;
		
		int alunos90 = 0;
		int alunosreprovados = 0;
		
		while (notafinal != 0){
		
		System.out.println("Informe a nota final do aluno ou do grupo de alunos com a mesma nota: ");
		notafinal = scan.nextDouble();
		
			if (notafinal > 0){
				
				System.out.println("Informe o total de faltas: ");
				totalfaltas = scan.nextInt();

			if (totalfaltas > 0){
		
				System.out.println("Informe a quantidade de alunos: ");
				conjuntoalunos = scan.nextInt();
				
			if (conjuntoalunos > 0){
				totalalunos += conjuntoalunos;
			
			}else if (notafinal >= 90){
					alunos90 += conjuntoalunos;
				
			}else if (notafinal < 70 || totalfaltas >= 20){
					alunosreprovados += conjuntoalunos;				
				
			}else if (notafinal > 0){
				medianotas = (medianotas + notafinal) / totalalunos;
		}
				
	}
	
			if (maiornota < notafinal){
				maiornota = notafinal;
				
			}if(menornota > notafinal){
				menornota = notafinal;
			
			}
			
			System.out.println("A quantidade de alunos que tiraram nota maior que 90, foram: " + alunos90);
			System.out.println("A quantidade de alunos que foram reprovados são: " + alunosreprovados);
			System.out.println("A maior nota é: " + maiornota + " e a menor nota é: " + menornota);
			System.out.println("A media da turma é: " + medianotas);
			
			System.out.println("---------------------------------------");
		
			
			}
		}
	}		
}
