package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1;
		double n2;
		int operacao;
		
		System.out.println("Informe o primeiro valor: ");
		n1 = leia.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		n2 = leia.nextDouble();
		
		System.out.println("Informe a operação a ser realizada: \n "
				+ "1)Média dos valores \n "
				+ "2)Subtrair o menor do maior \n "
				+ "3)Multiplicação \n "
				+ "4)Dividir o primeiro pelo segundo \n "
				+ "Escolha uma opção:");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println((n1 + n2) / 2);
			break;
		case 2:
			if(n1 > n2) {
				System.out.println(n1 - n2);
			} else if(n2 > n1) {
				System.out.println(n2 - n1);
			} else {
				System.out.println(0);
			};
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			if(n1 != 0) {
			System.out.println(n1 / n2);
			} else {
				System.out.println("Não é possível fazer divisão por 0");
			}
		};

	}

}
