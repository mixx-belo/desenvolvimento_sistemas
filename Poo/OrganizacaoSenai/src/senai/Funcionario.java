package senai;

public class Funcionario {
int codigo;
String nome, funcao;
double salario;

public Funcionario(int codigo, String nome, String funcao, double salario) {
	this.codigo = codigo;
	this.nome = nome;
	this.funcao = funcao;
	this.salario = salario;
}

public Funcionario() {
	this.codigo = 0;
	this.nome = "";
	this.funcao = "";
	this.salario = 0;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getFuncao() {
	return funcao;
}

public void setFuncao(String funcao) {
	this.funcao = funcao;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

void exibirDados() {
	System.out.printf("Código: %d%n"
			+ "Nome: %s%n"
			+ "Funcao: %s%n"
			+ "Salario: %.2f%n",
			codigo, nome, funcao, salario);
}
}
