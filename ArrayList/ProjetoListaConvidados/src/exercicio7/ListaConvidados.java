package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> convidados = new ArrayList<>();
		String convidado;
		int opcao, posicao;
		
		do {
			System.out.println("Escolha uma opção: \n" 
					+ "1)Adicionar convidado\n"
					+ "2)Alterar convidado\n"
					+ "3)Remover convidado\n"
					+ "4)Procurar convidado\n"
					+ "5)Exibir convidados\n"
					+ "6)Encerrar");
			opcao = Integer.parseInt(leia.nextLine());
			
			switch(opcao) {
				case 1: 
					System.out.println("Digite o nome do convidado: ");
					convidado = leia.nextLine();
					
					convidados.add(convidado);
					break;
					
				case 2: 
					
					System.out.println("Informe o número do convidado: ");
					posicao = Integer.parseInt(leia.nextLine());
					
					if(posicao < 0 || posicao > convidados.size()) {
						System.out.println("Posição inválida");
					} else {
					System.out.println("Digite o novo nome: ");
					convidados.set(posicao, leia.nextLine());
					}
					break;
					
				case 3:
					
						System.out.println("Informe o nome que deseja remover: ");
						convidado = leia.nextLine();
						
						if(!convidados.contains(convidado)) {
							System.out.println("Nome não encontrado");
						} else {
					convidados.remove(convidado);
						}
					break;
					
				case 4:
					
						System.out.println("Informe o nome que deseja procurar: ");
						convidado = leia.nextLine();
						
						if(!convidados.contains(convidado)) {
							System.out.println("Nome não encontrado");
						} else {
					System.out.println("Posição de " + convidado + ": " + convidados.indexOf(convidado));
						}
					break;
				case 5: 
					for(String convidadosCadastrados : convidados) {
						System.out.println(convidadosCadastrados);
					}
					break;
				case 6:
					System.out.println("Programa encerrado.");
					break;
				default:
					System.out.println("Opção inválida");
			}
		} while (opcao != 6);
		leia.close();
	}
	

}
