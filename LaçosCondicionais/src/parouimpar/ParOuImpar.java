package parouimpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        // Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.print("O Número " + numero + " é par");
        } else {
            System.out.print("O Número " + numero + " é ímpar");
        }

        // Verifica se é positivo ou negativo
        if (numero >= 0) {
            System.out.println(" e positivo!");
        } else {
            System.out.println(" e negativo!");
        }

        input.close();
    }
}