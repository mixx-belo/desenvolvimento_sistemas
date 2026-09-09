package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor = 1;
		
		while(valor > 0) {
			
			System.out.println("Informe o valor:");
			valor = leia.nextDouble();
			
			if(valor <= 0) {
				System.out.println("Operação encerrada");
				break;
			}
			
			System.out.println("Valor: " + valor);
			
			System.out.println("Valor ao quadrado: " + Math.pow(valor, 2));
			
			System.out.println("Valor ao cubo: " + Math.pow(valor, 3));
			
			System.out.printf("Raiz quadrada do valor: " + Math.sqrt(valor));
			
		};

	}

}
