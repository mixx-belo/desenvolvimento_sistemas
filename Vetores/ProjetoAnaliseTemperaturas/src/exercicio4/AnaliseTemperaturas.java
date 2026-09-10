package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double [] temperaturas = new double [7];
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Informe a temperatura do " + (i + 1) + "º dia:");
			temperaturas [i] = Double.parseDouble(leia.nextLine());
		}
		
		double maiorTemperatura = temperaturas[0];
		double menorTemperatura = temperaturas[0];
		
		for (int i = 0; i < temperaturas.length; i++) {
			if(maiorTemperatura < temperaturas[i]) {
				maiorTemperatura = temperaturas[i];
			}
			
			if(menorTemperatura > temperaturas[i]) {
				menorTemperatura = temperaturas[i];
			}
		}
		
		System.out.println("Maior Temperatura: " + maiorTemperatura);
		System.out.println("Menor Temperatura: " + menorTemperatura);
	}
}
