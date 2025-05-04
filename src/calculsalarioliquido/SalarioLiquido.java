package calculsalarioliquido;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        System.out.print("Salário Bruto: ");
        salarioBruto = input.nextFloat();

        System.out.print("Adicional Noturno: ");
        adicionalNoturno = input.nextFloat();

        System.out.print("Horas Extras: ");
        horasExtras = input.nextFloat();

        System.out.print("Descontos: ");
        descontos = input.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.println("Salário Líquido: " + salarioLiquido);
        
        input.close();
    }
}