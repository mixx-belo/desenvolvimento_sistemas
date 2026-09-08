package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base;
		double altura;
		double area;
		
		do {
		
			System.out.println("Informe o valor da base: ");
			base = leia.nextDouble();
		
			System.out.println("Informe o valor da altura: ");
			altura = leia.nextDouble(); 
			
			if (base < 0 || altura < 0) {
				System.out.println("Erro: Valor Negativo");
			}
		} while (base < 0 || altura < 0);
		
		area = (base * altura) / 2;
		
		System.out.println("Area:" + area +" m²");
		
	}

}
