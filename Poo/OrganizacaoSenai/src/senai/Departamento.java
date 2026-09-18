package senai;

import java.util.ArrayList;

public class Departamento {
int codigo;
String nome, telefone;

ArrayList <String> funcionarios = new ArrayList<>();

public Departamento(int codigo, String nome, String telefone, ArrayList<String> funcionarios) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.telefone = telefone;
	this.funcionarios = funcionarios;
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

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public ArrayList<String> getFuncionarios() {
	return funcionarios;
}

public void setFuncionarios(ArrayList<String> funcionarios) {
	this.funcionarios = funcionarios;
}

void adicionarFuncionario() {
}
}
