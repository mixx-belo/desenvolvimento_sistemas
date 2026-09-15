package aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		do {
			System.out.println("Digite um nome: ");
			nome = leia.nextLine();
			
			nomes.add(nome);
			
			System.out.println("Deseja adicionar outro nome ? (s/n): ");
			continuar = leia.nextLine();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println("Nomes cadastrados: ");
		
		for(String nomeCadastrado : nomes) {
			System.out.println(nomeCadastrado);
		}
		
		leia.close();

	}

}
