package salariocomabono;

import java.util.Scanner;

public class SaláriocomAbono {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        float salario, abono, novoSalario;

	        System.out.print("Digite o salário: ");
	        salario = input.nextFloat();

	        System.out.print("Digite o abono: ");
	        abono = input.nextFloat();

	        novoSalario = salario + abono;

	        System.out.println("Novo Salário: " + novoSalario);
	        
	        input.close();
	    }
	}
