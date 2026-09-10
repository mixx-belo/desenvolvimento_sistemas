package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double [] notas = new double [4];
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i+1) + "º nota: ");
			notas [i] = Double.parseDouble(leia.nextLine());
			
			soma += notas[i];
		}
		
		System.out.println("Média:" + (soma / notas.length) );
	}

}
