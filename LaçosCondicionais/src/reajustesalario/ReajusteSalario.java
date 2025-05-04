package reajustesalario;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do colaborador: ");
        String nome = input.nextLine();

        System.out.print("Cargo: ");
        int codigoCargo = input.nextInt();
        input.nextLine();
        
        System.out.print("Salário: R$ ");
        float salario = input.nextFloat();

        String cargo = "";
        float percentual = 0;

        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido!");
                input.close();
                return; 
        }

        float novoSalario = salario + (salario * percentual);

        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + novoSalario);

    }
}