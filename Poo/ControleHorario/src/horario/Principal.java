package horario;

public class Principal {

	public static void main(String[] args) {
		Horario tempo1 = new Horario();
		
		tempo1.exibir();
		
		tempo1.setHora(8);
		tempo1.setMinuto(15);
		tempo1.setSegundo(30);
		
		tempo1.exibir();
		System.out.println("Total de minutos: " + tempo1.calcularSegundos());
		
		Horario tempo2 = new Horario(14,20,05);
		
		tempo2.exibir();
		
		System.out.println("Total de minutos: " + tempo2.calcularSegundos());

	}

}
