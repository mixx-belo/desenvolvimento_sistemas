package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int mes;
		String nome;
		
		do {
			System.out.println("Informe o mes: ");
			mes = leia.nextInt();
			
			switch(mes) {
			case 1:
				nome = "Janeiro";
				break;
			case 2:
				nome = "Fevereiro";
				break;
			case 3:
				nome = "Março";
				break;
			case 4:
				nome = "Abril";
				break;
			case 5:
				nome = "Maio";
				break;
			case 6:
				nome = "Junho";
				break;
			case 7: 
				nome = "Julho";
				break;
			case 8:
				nome = "Agosto";
				break;
			case 9:
				nome = "Setembro";
				break;
			case 10:
				nome = "Outubro";
				break;
			case 11:
				nome = "Novembro";
				break;
			case 12:
				nome = "Dezembro";
				break;
			default:
				nome="Mês inválido";
			}
			
		}while (mes < 1 && mes > 12);
		
		System.out.println("Mês: " + nome);
	}

}
