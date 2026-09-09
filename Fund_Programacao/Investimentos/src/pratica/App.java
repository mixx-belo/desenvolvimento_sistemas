package pratica;

public class App {

	public static void main(String[] args) {
		double ivCarlos = 3000;
		double ivJoao = 1000;
		int mes = 0;
		
		while (ivJoao < ivCarlos) {
			ivCarlos = ivCarlos + (ivCarlos * 0.02);
			
			ivJoao = ivJoao + (ivJoao * 0.05);
			
			mes++;
		}
		
		System.out.println("Quantidade de mês necessário: " + mes);
		System.out.println("Valor acumulado por Carlos: " + ivCarlos);
		System.out.println("Valor acumulado por João: " + ivJoao);
	}

}
