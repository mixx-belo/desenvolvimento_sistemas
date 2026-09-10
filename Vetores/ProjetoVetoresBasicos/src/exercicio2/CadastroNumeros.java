package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] numeros= new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número da posição " + i + ": ");
			numeros [i] = Integer.parseInt(leia.nextLine());
		}
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
	}

}
