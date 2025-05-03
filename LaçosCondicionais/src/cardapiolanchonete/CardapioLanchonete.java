package cardapiolanchonete;

import java.util.Scanner;

public class CardapioLanchonete {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Código do Produto: ");
        int codigo = input.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        String produto = "";
        double preco = 0;

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.0;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.0;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.0;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.0;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.0;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.0;
                break;
            default:
                System.out.println("Código inválido!");
                return; 
        }

        double total = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Valor total: R$ " + total);

        input.close();
    }
}