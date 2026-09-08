package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = leia.nextInt();
		
		if (idade < 5) {
			System.out.println("Idade Inválida ");
		}else if (idade <= 7) {
			System.out.println("Categoria Infantil");
		}else if (idade <= 10) {
			System.out.println("Categoria Juvenil");
		}else if(idade <= 15) {
			System.out.println("Categoria Adolescente");
		}else if(idade <=30) {
			System.out.println("Categoria Adulto");
		}else if(idade > 30) {
			System.out.println("Categoria Sênior");
		}
	
	}

}
