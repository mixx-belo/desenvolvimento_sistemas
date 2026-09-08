package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dia;
		String nome;
		
		do {
			System.out.println("Informe o dia: ");
			dia = leia.nextInt();
			
			switch(dia) {
			case 1:
				nome = "Domingo";
				break;
			case 2:
				nome = "Segunda-feira";
				break;
			case 3:
				nome = "Terça-feira";
				break;
			case 4:
				nome = "Quarta-feira";
				break;
			case 5:
				nome = "Quinta-feira";
				break;
			case 6:
				nome = "Sexta-feira";
				break;
			case 7: 
				nome = "Sábado";
				break;
			default :
				nome = "Dia inválido";
			}
			
		}while (dia < 1 && dia > 7);
		
		System.out.println("Dia: " + nome);

	}

}
