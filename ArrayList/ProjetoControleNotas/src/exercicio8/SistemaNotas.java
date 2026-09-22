package exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> alunos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		int opcao;
		String aluno;
		Double nota;
		
		do {
			System.out.println("Escolha uma opção: \n" 
					+ "1)Cadastrar aluno\n"
					+ "2)Listar alunos\n"
					+ "3)Procurar aluno\n"
					+ "4)Alterar nota\n"
					+ "5)Remover aluno\n"
					+ "6)Exibir média da turma\n"
					+ "7)Exibir maior e menor nota\r\n"
					+ "8)Exibir situação dos alunos\n"
					+ "9)Encerrar");
			opcao = Integer.parseInt(leia.nextLine());
			
			switch(opcao) {
			case 1:
				System.out.println("Informe o nome do aluno: ");
				aluno = leia.nextLine();
				
				System.out.println("Informe a nota do aluno: ");
				nota = Double.parseDouble(leia.nextLine());
				
				alunos.add(aluno);
				notas.add(nota);
				break;
			case 2:
				if(alunos.isEmpty()) {
					System.out.println("Nenhum, aluno cadastrado");
				} else {
					for(int i = 0; i <= alunos.size();i++) {
						System.out.println("Posição: " + i + " - " + alunos.get(i) + " - Nota: " + notas.get(i));
					}
				}
				break;
			case 3: 
				System.out.println("Informe o nome do aluno: ");
				aluno = leia.nextLine();
				
				if (alunos.indexOf(aluno) = -1) {
					
				}
			}
		} while (opcao != 9);
		leia.close();
	}
}
