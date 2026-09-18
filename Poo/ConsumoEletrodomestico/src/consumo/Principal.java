package consumo;

public class Principal {

	public static void main(String[] args) {
		Eletrodomestico ventilador = new Eletrodomestico();
		
		ventilador.setHorasPorDia(8);
		ventilador.setNome("ventilador");
		ventilador.setPotenciaWatts(100);
		
		ventilador.exibirRelatorio(0.90);
		

	}

}
