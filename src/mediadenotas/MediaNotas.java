package mediadenotas;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.print("Nota 1: ");
        nota1 = input.nextFloat();

        System.out.print("Nota 2: ");
        nota2 = input.nextFloat();

        System.out.print("Nota 3: ");
        nota3 = input.nextFloat();

        System.out.print("Nota 4: ");
        nota4 = input.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média final: " + media);
        
        input.close();
    }
}