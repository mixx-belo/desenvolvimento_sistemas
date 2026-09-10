package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int[8];
		int qtdPar = 0, qtdImpar = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º valor:");
			numeros[i] = Integer.parseInt(leia.nextLine());
			
			if(numeros[i] % 2 == 0) {
				System.out.println("Número " + numeros[i] + " é par");
				qtdPar++;
			} else {
				System.out.println("Número " + numeros[i] + " é ímpar");
				qtdImpar++;
			}
		}
		
		System.out.println("Quantidade de pares: " + qtdPar);
		System.out.println("Quantidade de ímpares: " + qtdImpar);
		
		

	}

}
