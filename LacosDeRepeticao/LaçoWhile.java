package lacowhile;

		import java.util.Scanner;

		public class LaçoWhile {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int idade, menores21 = 0, maiores50 = 0;

		        System.out.print("Digite uma idade: ");
		        idade = scanner.nextInt();

		        while (idade >= 0) {
		            if (idade < 21) {
		                menores21++;
		            } else if (idade > 50) {
		                maiores50++;
		            }

		            System.out.print("Digite uma idade: ");
		            idade = scanner.nextInt();
		        }

		        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
		        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

		        scanner.close();
		    }
	}