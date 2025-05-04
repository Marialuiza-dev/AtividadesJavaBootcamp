package lacofor;
import java.util.Scanner;

public class laçofor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int fim = scanner.nextInt();

        if (inicio >= fim) {
            System.out.println("Intervalo inválido!");
        } else {
            System.out.println("\nNo Intervalo entre " + inicio + " e " + fim + ":");
            for (int i = inicio; i <= fim; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }

        scanner.close();
    }
}