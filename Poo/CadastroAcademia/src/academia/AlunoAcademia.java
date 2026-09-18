package academia;

public class AlunoAcademia {
String nome;
int idade;
double peso, altura;
public AlunoAcademia(String nome, int idade, double peso, double altura) {
	this.nome = nome;
	this.idade = idade;
	this.peso = peso;
	this.altura = altura;
}

public AlunoAcademia() {
	this.nome = "";
	this.idade = 0;
	this.peso = 0;
	this.altura = 0;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

boolean ehMenorDeIdade() {
	return (idade < 18) ? true : false;
}

double calcularIMC() {
	return peso / (altura * altura);
}

void exibirDados() {
	System.out.printf("Nome do aluno: %s%n"
			+ "Idade: %d%n"
			+ "Peso: %.2fkg%n"
			+ "Altura: %.2fm%n"
			+ "IMC: %.2f%n"
			+ "Direito a desconto: %s%n%n",
			nome, idade, peso, altura, calcularIMC(), ehMenorDeIdade() ? "Sim" : "Não");
}
}
