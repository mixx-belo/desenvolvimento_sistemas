package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int operacao;
		double salario;
		
		do {
			
			System.out.println("Informe a operação a ser realizada\n"
					+ "1)Cálculo do imposto\n"
					+ "2)Cálculo do novo salário\n"
					+ "3)Classificação do salário\n"
					+ "4)Finalizar o programa");
			operacao = leia.nextInt();
			
			switch(operacao) {
			case 1:
				do {
					System.out.println("Informe o salário:");
					salario = leia.nextDouble();
				} while(salario <= 0);
				
				if(salario < 500) {
					System.out.println("Valor do imposto: " + salario * 0.05);
				} else if(salario <= 850) {
					System.out.println("Valor do imposto: " + salario * 0.1);
				} else {
					System.out.println("Valor do imposto: " + salario * 0.15);
				}
				break;
			case 2:
				do {
					System.out.println("Informe o salário:");
					salario = leia.nextDouble();
				} while(salario <= 0);
				
				if(salario < 450) {
					System.out.println("Novo salário: " + (salario + 100));
				} else if (salario <= 749.99) {
					System.out.println("Novo salário: " + (salario + 75));
				} else if (salario <= 1500) {
					System.out.println("Novo salário: " + (salario + 50));
				} else {
					System.out.println("Novo salário: " + (salario + 250));
				}
				break;
			case 3:
				do {
					System.out.println("Informe o salário:");
					salario = leia.nextDouble();
				} while(salario <= 0);
				
				if(salario < 700) {
					System.out.println("Mal remunerado");
				} else {
					System.out.println("Bem remunerado");
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Erro: número de operação inválido");
			}
		} while (operacao != 4);
	}

}
