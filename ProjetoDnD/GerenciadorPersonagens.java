package ProjetoDnD;

import java.util.List;
import java.util.ArrayList;
public class GerenciadorPersonagens {
	private List<Personagem> personagens;

	public GerenciadorPersonagens(){
	  		this.personagens = new ArrayList<>();
	  }

	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void addPersonagem(Personagem personagem) {
		personagens.add(personagem);
	}
	public void listarPersonagens() {
		for (Personagem p: personagens) {
			System.out.println(p);
		}
	}

}
