package diferenciandoprodutos;

import java.util.Scanner;

public class DiferencaProdutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1, n2, n3, n4, diferenca;

        System.out.print("Número 1: ");
        n1 = input.nextFloat();

        System.out.print("Número 2: ");
        n2 = input.nextFloat();

        System.out.print("Número 3: ");
        n3 = input.nextFloat();

        System.out.print("Número 4: ");
        n4 = input.nextFloat();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + diferenca);
        
        input.close();
    }
}