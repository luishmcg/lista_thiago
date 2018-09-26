import java.util.Scanner;

	public class Sequencial02 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int x = 0;
			
			System.out.println("Digite um número negativo para saber seu valor positivo");
			x = scan.nextInt();
			
			if(x <= 0){
				System.out.println(-x);
			}
			else{
				System.out.println("Deve ser um numero negativo");
			}
	}

}
