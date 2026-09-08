package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor;
		
		do {
			System.out.println("Informe o valor positivo: ");
			valor = leia.nextDouble();
			
			if( valor < 0) {
				System.out.println("Erro: Valor Negativo");
			}
		} while (valor < 0);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(valor +" x "+ i + " = "+ valor * i);
		}

	}

}
