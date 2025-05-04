package VetoreseMatrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaPrincipal = 0, somaSecundaria = 0;

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        // Diagonal principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        // Diagonal secundária
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecundaria += matriz[i][2 - i];
        }

        // Somas
        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
    }
}