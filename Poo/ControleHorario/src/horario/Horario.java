package horario;

public class Horario {
int hora, minuto, segundo;

public Horario(int hora, int minuto, int segundo) {
	if((hora >= 0 && hora <= 23) && (minuto >= 0 && minuto <= 59) && (segundo >= 0 && segundo <= 59)) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;	
	} else {
		System.out.println("Valores inválidos");
	}
}

public Horario() {
	this.hora = 0;
	this.minuto = 0;
	this.segundo = 0;
}

public int getHora() {
	return hora;
}

public void setHora(int hora) {
	this.hora = hora;
}

public int getMinuto() {
	return minuto;
}

public void setMinuto(int minuto) {
	this.minuto = minuto;
}

public int getSegundo() {
	return segundo;
}

public void setSegundo(int segundo) {
	this.segundo = segundo;
}

int calcularSegundos() {
	return (hora * 3600) + (minuto * 60) + segundo;
}

void exibir() {
	System.out.printf("Hora: %02d:%02d:%02d%n%n",hora,minuto, segundo);
}

}
