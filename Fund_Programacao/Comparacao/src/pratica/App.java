package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n1 = leia.nextInt();
		
		if(n1 > 20) {
			System.out.println("Maior que vinte");
		}else if(n1 < 20) {
			System.out.println("Menor que vinte");
		} else {
			System.out.println("Igual a vinte");
	}

}
}