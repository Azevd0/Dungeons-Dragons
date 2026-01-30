package ProjetoDnD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorPersonagem {
	private List<Personagem> personagens;
	Scanner scan = new Scanner(System.in);

	public GerenciadorPersonagem() {
		this.personagens = new ArrayList<>();
	}
	public String lerCampoObrigatorio(String nomeCampo) {
	    String entrada;
	    do { System.out.print("Digite " + nomeCampo + ": ");
	        entrada = scan.nextLine().trim();
	        if (entrada.isEmpty()) {
	            System.out.println(nomeCampo + " é obrigatório. Tente novamente.\n");
	        }
	    } while (entrada.isEmpty());
	    return entrada;
	}

	public List<Personagem> getPersonagens() {
		return personagens;
	}
	public void Menu() {
		System.out.println(
				"O que quer fazer com sua biblioteca?\n1 - Remover item\n2 - Adicionar item\n3 - Listar todos os itens\n4 - Listar item por categoria");
		int menu = scan.nextInt();
		scan.nextLine();
		
		
	}
	public void adicionarItem(Personagem jogador) {
		personagens.add(jogador);
	}
	public void listarTodos() {
		for (Personagem jogador : personagens) {
			System.out.println(jogador);
		}
	}
	
	
}
