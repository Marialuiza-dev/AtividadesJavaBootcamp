package VetoreseMatrizes;
import java.util.Scanner;

public class VetorExercicio {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int[] vetor = new int[10];
			int soma = 0;
			double media;

			// Leitura dos 10 números
			System.out.println("Digite 10 números inteiros:");
			for (int i = 0; i < vetor.length; i++) {
			    vetor[i] = input.nextInt();
			    soma += vetor[i];
			}

			// Exibir elementos em índices ímpares
			System.out.println("\nElementos nos índices ímpares:");
			for (int i = 1; i < vetor.length; i += 2) {
			    System.out.print(vetor[i] + " ");
			}

			// Exibir números pares
			System.out.println("\n\nElementos pares:");
			for (int num : vetor) {
			    if (num % 2 == 0) {
			        System.out.print(num + " ");
			    }
			}

			// Soma e média
			media = soma / 10.0;
			System.out.println("\n\nSoma: " + soma);
			System.out.printf("Média: %.2f\n", media);
		}
    }
}