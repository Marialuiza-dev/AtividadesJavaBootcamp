package somacomparacao;

import java.util.Scanner;

public class SomaComparacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int a = input.nextInt();

        System.out.print("Digite o número B: ");
        int b = input.nextInt();

        System.out.print("Digite o número C: ");
        int c = input.nextInt();

        int soma = a + b;

        System.out.println(a + " + " + b + " = " + soma);

        if (soma > c) {
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < c) {
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println("A Soma de A + B é Igual a C");
        }

        input.close();
    }
}