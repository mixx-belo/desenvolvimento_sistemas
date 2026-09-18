package consumo;

public class Eletrodomestico {
String nome;
double potenciaWatts, horasPorDia, minutos;

public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
	if((horasPorDia >= 0 && horasPorDia <= 24) && (potenciaWatts > 0)) {
	this.nome = nome;
	this.potenciaWatts = potenciaWatts;
	this.horasPorDia = horasPorDia;
	} else {
		System.out.println("Valores inválidos");
	}
}

public Eletrodomestico() {
	this.nome = "";
	this.potenciaWatts = 0.0;
	this.horasPorDia = 0.0;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPotenciaWatts() {
	return potenciaWatts;
}

public void setPotenciaWatts(double potenciaWatts) {
	this.potenciaWatts = potenciaWatts;
}

public double getHorasPorDia() {
	return horasPorDia;
}

public void setHorasPorDia(double horasPorDia) {
	this.horasPorDia = horasPorDia;
}

double  consumoDiarioWh() {
	return potenciaWatts * horasPorDia;
}

double consumoMensalWh() {
	return consumoDiarioWh() * 30;
}

double consumoAnualWh() {
	return consumoMensalWh() * 12;
}

double gastoMensal(double precoKwh) {
	return (consumoMensalWh() / 1000) * precoKwh;
}

void exibirRelatorio(double precoKwh) {
	System.out.printf("Nome do aparelho: %s%n"
			+ "Horas de consumo: %.2f%n"
			+ "Potência em Watts: %.2f%n"
			+ "Consumo diário: %.2f%n"
			+ "Consumo mensal: %.2f%n"
			+ "Consumo anual: %.2f%n"
			+ "Tarifa: %.2f%n"
			+ "Custo mensal: %.2f%n",
			nome, horasPorDia, potenciaWatts, consumoDiarioWh(), 
			consumoMensalWh(), consumoAnualWh(),precoKwh,gastoMensal(precoKwh));
}

}