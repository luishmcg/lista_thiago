import java.util.Scanner;

	public class Sequencial03 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dm = 0;
		int dmn = 0;
		int area = 0;
		
		System.out.println("Para saber a area do losango, informe a digonal maior: ");
		dm = scan.nextInt();
		
		System.out.println("Agora informe a diagonal menor: ");
		dmn = scan.nextInt();
		
		area = (dm * dmn) / 2;
		
		System.out.println("A area do seu losango é: " + area);
		
	}

}
