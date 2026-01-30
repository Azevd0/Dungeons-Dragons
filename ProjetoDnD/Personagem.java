package ProjetoDnD;

import java.util.Random;
import java.util.Scanner;

public class Personagem {
	public String nome;
	private int forca;
	private int destreza;
	private int constituicao;
	private int inteligencia;
	private int sabedoria;
	private int carisma;
	private int bonusProficiencia;
	private int vantagem;
	private int iniciativa;
	private int resultadoIniciativaCombate;
	
	
	public int getResultadoIniciativaCombate() {
        return resultadoIniciativaCombate;
    }

	public Personagem(String no, int forca, int des, int cons, int in, int sab, int car, int bp, int ini) {
		this.nome = no;
		this.forca = forca;
		this.destreza = des;
		this.constituicao = cons;
		this.inteligencia = in;
		this.sabedoria = sab;
		this.carisma = car;
		this.bonusProficiencia = bp;
		this.iniciativa = ini;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getBonusProficiencia() {
		return bonusProficiencia;
	}

	public void setBonusProficiencia(int bonusProficiencia) {
		this.bonusProficiencia = bonusProficiencia;
	}
	

	public int getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	public int getVantagem() {
		return vantagem;
	}

	public void setVantagem(int vantagem) {
		this.vantagem = vantagem;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nForca: " + forca + "\nDestreza: " + destreza + "\nConstituicao:" + constituicao
				+ "\nInteligencia: " + inteligencia + "\nSabedoria: " + sabedoria + "\nCarisma: " + carisma
				+ "\nBônus de Proficiência: " + bonusProficiencia + "\n";
	}
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	public int vantagem() {
		System.out.println("Como você vai jogar?\n1 - Na vantagem\n2 - Na desvantagem\n3 - Jogada normal");
		int rolagem = scan.nextInt();
		switch (rolagem) {
		case 1:
			System.out.println("---JOGADA VANTAJOSA---");
			break;
		case 2:
			System.out.println("---JOGADA DESVANTAJOSA---");
			break;
		case 3:
			System.out.println("---JOGADA NORMAL---");
			break;
		default:
			System.out.println("Inválido");
		}
		return rolagem;
	}
	public void iniciativa() {
	    System.out.println("Como " + getNome() +" rolar a iniciativa?");
	    System.out.println("1 - Vantagem");
	    System.out.println("2 - Desvantagem");
	    System.out.println("3 - Normal");

	    int escolha = scan.nextInt();
	    int bonusIniciativa = getIniciativa();
	    int d1 = ran.nextInt(1, 21);
	    int d2 = ran.nextInt(1, 21);

	    int resultado = 0;

	    switch (escolha) {
	        case 1:
	            resultado = Math.max(d1, d2) + bonusIniciativa;
	            System.out.println("Rolou com vantagem! D1: " + d1 + ", D2: " + d2);
	            break;
	        case 2:
	            resultado = Math.min(d1, d2) + bonusIniciativa;
	            System.out.println("Rolou com desvantagem! D1: " + d1 + ", D2: " + d2);
	            break;
	        case 3:
	            resultado = d1 + bonusIniciativa;
	            System.out.println("Rolou normalmente! D: " + d1);
	            break;
	        default:
	            System.out.println("Opção inválida!");
	            return;
	            
	    }
	    this.resultadoIniciativaCombate = resultado;
        System.out.println("Iniciativa Total de " + this.nome + ": " + this.resultadoIniciativaCombate + "\n");
	}

	public void rolarDado() {
	    boolean continuarTurno = true;
	    
	    System.out.println("---Turno de " + getNome()+ "---"); 
	    
	    while (continuarTurno) {
	    	System.out.println("\nO que " + getNome() + " vai fazer?");
	    	System.out.println("1 - Teste de resistência");
	    	System.out.println("2 - Teste de perícia");
	    	System.out.println("3 - Jogada de ataque");
	    	System.out.println("4 - Dano em área");
	    	System.out.println("5 - Finalizar turno");

	        
	        int tipoTeste = scan.nextInt();
	        scan.nextLine();

	        if (tipoTeste == 1) {
	            testeResistencia();
	        } else if (tipoTeste == 2) {
	            pericias();
	        } else if (tipoTeste == 3) {
	            ataque();
	        } else if (tipoTeste == 4) {
	            danoArea();
	        }  else if (tipoTeste == 5) {
	            System.out.println("--- TURNO DE " + getNome() + " FINALIZADO ---\n");
	            continuarTurno = false;
	        } else {
	            System.out.println("--- OPÇÃO INVÁLIDA ---");
	        }

	    }
	}

	public int atributo() {
		System.out.println(
				"Selecione o atributo da rolagem:\n1 - Força\n2 - Destreza\n3 - Constituição\n4 - Inteligência\n5 - Sabedoria\n6 - Carisma");
		int atributo = scan.nextInt();
		switch (atributo) {
		case 1:
			return getForca();
		case 2:
			return getDestreza();
		case 3:
			return getConstituicao();
		case 4:
			return getInteligencia();
		case 5:
			return getSabedoria();
		case 6:
			return getCarisma();
		default:
			System.out.println("---INVÁLIDO---");
			return 0;
		}

	}

	public void testeResistencia() {
	    System.out.println("Digite a dificuldade do teste");
	    int ND = scan.nextInt();

	    int atributo = atributo();
	    System.out.println("Proficiente?\n1 - Sim\n2 - Não");
	    int proficiente = scan.nextInt();

	    int rolagem = vantagem();
	    int resultadoFinal = 0;

	    int d1 = ran.nextInt(1, 21);
	    int d2 = ran.nextInt(1, 21);

	    if (rolagem == 1) {
	        resultadoFinal = Math.max(d1, d2);
	        System.out.println("Rolou com vantagem: " + d1 + " e " + d2 + " -> " + resultadoFinal);
	    } else if (rolagem == 2) {
	        resultadoFinal = Math.min(d1, d2);
	        System.out.println("Rolou com desvantagem: " + d1 + " e " + d2 + " -> " + resultadoFinal);
	    } else { // normal
	        resultadoFinal = d1;
	        System.out.println("Rolou normalmente: " + resultadoFinal);
	    }

	    resultadoFinal += atributo;
	    if (proficiente == 1) {
	        resultadoFinal += getBonusProficiencia();
	        System.out.println("Bônus de proficiência aplicado: " + getBonusProficiencia());
	    }

	    System.out.println("Modificador de atributo: " + atributo);
	    System.out.println("Resultado final: " + resultadoFinal + " contra dificuldade " + ND);

	    if (resultadoFinal >= ND) {
	        System.out.println("Você passou!");
	    } else {
	        System.out.println("Você não passou!");
	    }
	}


	public int skills() {
		System.out.println(
				"Selecione a perícia: \n1 - Atletismo, 2 - Acrobacia, 3 - Furtividade\n4 - Prestidigitação, 5 - Arcanismo, 6 - História"
						+ "\n7 - Investigação, 8 - Natureza, 9 - Religião\n10 - Adestrar animais, 11 - Intuição, 12 - Medicina\n13 - Percepção, 14 - Sobrevivência, 15 - Atuação"
						+ "\n16 - Blefar, 17 - Intimidação, 18 - Persuasão");
		int habilidades = scan.nextInt();
		switch (habilidades) {
		case 1:
			return getForca();
		case 2, 3, 4:
			return getDestreza();
		case 5, 6, 7, 8, 9:
			return getInteligencia();
		case 10, 11, 12, 13, 14:
			return getSabedoria();
		case 15, 16, 17, 18:
			return getCarisma();
		default:
			System.out.println("---INVÁLIDO---");
			return 0;
		}

	}

	public void pericias() {
		System.out.println("Digite a dificuldade do teste");
		int ND = scan.nextInt();
		int d20 = ran.nextInt(1, 21);
		int habilidade = skills();
		System.out.println("Proficiente?\n1 - Proficiente\n2 - Não proficiente\n3 - Especialista");
		int proficiente = scan.nextInt();
		int rolagem = vantagem();

		if (proficiente == 1) {

			if (rolagem == 1) {
				int d1 = ran.nextInt(1, 21);
				int d2 = ran.nextInt(1, 21);
				d20 = Math.max(d1, d2) + habilidade + getBonusProficiencia();
				System.out.println(d1 + " e " + d2 + ", pegando " + Math.max(d1, d2));
			} else if (rolagem == 2) {
				int d1 = ran.nextInt(1, 21);
				int d2 = ran.nextInt(1, 21);
				d20 = Math.min(d1, d2) + habilidade + getBonusProficiencia();
				System.out.println(d1 + " e " + d2 + ", pegando " + Math.min(d1, d2));
			} else {
				int dace = ran.nextInt(1, 21);
				d20 = dace + habilidade + getBonusProficiencia();
				System.out.println("Seu dado foi " + dace);
			}

			System.out.println("Seu modificador de atributo é " + habilidade
					+ "\ne seu bônus de proficiência para esse teste é " + getBonusProficiencia());
			System.out.println("Você tirou " + d20 + ", a dificuldade era " + ND);

			if (d20 >= ND) {
				System.out.println("Você passou!");
			} else {
				System.out.println("Você não passou!");
			}
		} else if (proficiente == 2) {

			if (rolagem == 1) {
				int d1 = ran.nextInt(1, 21);
				int d2 = ran.nextInt(1, 21);
				d20 = Math.max(d1, d2) + habilidade;
				System.out.println(d1 + " e " + d2 + ", pegando " + Math.max(d1, d2));
			} else if (rolagem == 2) {
				int d1 = ran.nextInt(1, 21);
				int d2 = ran.nextInt(1, 21);
				d20 = Math.min(d1, d2) + habilidade;
				System.out.println(d1 + " e " + d2 + ", pegando " + Math.min(d1, d2));
			} else {
				int dace = ran.nextInt(1, 21);
				d20 = dace + habilidade + getBonusProficiencia();
				System.out.println("Seu dado foi " + dace);
			}

			System.out.println("Seu modificador de atributo é " + habilidade);
			System.out.println("Você tirou " + d20 + ", a dificuldade era " + ND);

			if (d20 >= ND) {
				System.out.println("Você passou!");
			} else {
				System.out.println("Você não passou!");
			}
		} else if (proficiente == 3) {

			if (rolagem == 1) {
				int d1 = ran.nextInt(1, 21);
				int d2 = ran.nextInt(1, 21);
				d20 = Math.max(d1, d2) + habilidade;
				System.out.println(d1 + " e " + d2 + ", pegando " + Math.max(d1, d2));
			} else if (rolagem == 2) {
				int d1 = ran.nextInt(1, 21);
				int d2 = ran.nextInt(1, 21);
				d20 = Math.min(d1, d2) + habilidade;
				System.out.println(d1 + " e " + d2 + ", pegando " + Math.min(d1, d2));
			} else {
				int dace = ran.nextInt(1, 21);
				d20 = dace + habilidade + getBonusProficiencia();
				System.out.println("Seu dado foi " + dace);
			}

			System.out.println("Seu modificador de atributo é " + habilidade
					+ "\ne seu bônus de proficiência para esse teste é " + (getBonusProficiencia() * 2));
			System.out.println("Você tirou " + d20 + ", a dificuldade era " + ND);

			if (d20 >= ND) {
				System.out.println("Você passou!");
			} else {
				System.out.println("Você não passou!");
			}
		}

	}

	public void ataque() {
	    System.out.println("Digite a Classe de armadura do alvo:");
	    int ND = scan.nextInt();

	    int atributo = atributo();
	    System.out.println("Proficiente?\n1 - Sim\n2 - Não");
	    int proficiente = scan.nextInt();

	    int rolagem = vantagem();
	    int d20 = 0;

	    int d1 = ran.nextInt(1, 21);
	    int d2 = ran.nextInt(1, 21);

	    if (rolagem == 1) { 
	        d20 = Math.max(d1, d2);
	        System.out.println("Rolou com vantagem: " + d1 + " e " + d2 + " -> " + d20);
	    } else if (rolagem == 2) { 
	        d20 = Math.min(d1, d2);
	        System.out.println("Rolou com desvantagem: " + d1 + " e " + d2 + " -> " + d20);
	    } else {
	        d20 = d1;
	        System.out.println("Rolou normalmente: " + d20);
	    }

	    if (d20 == 20) {
	        System.out.println("🎯 ACERTO CRÍTICO! O ataque é automaticamente bem-sucedido!");
	        int rolarDano = rolarDano();
	        int modificador = atributo();
	        System.out.println("Digite seu bônus de ataque.(Se não tiver, digite 0):");
	        int bonus = scan.nextInt();

	        int danoTotal = (rolarDano * 2) + modificador + bonus;
	        System.out.println("Seu dado foi " + rolarDano + " (dobrado para " + (rolarDano * 2) + ")");
	        System.out.println("Seu modificador de atributo é " + modificador + "\ne seu bônus de ataque é " + bonus);
	        System.out.println("Você causou " + danoTotal + " de dano CRÍTICO!\n");
	        return;
	    } else if (d20 == 1) {
	        System.out.println("💥 ERRO CRÍTICO! O ataque falhou automaticamente.");
	        return;
	    }

	    int resultadoFinal = d20 + atributo + (proficiente == 1 ? getBonusProficiencia() : 0);
	    System.out.println("Resultado final: " + resultadoFinal + " contra CA " + ND);

	    if (resultadoFinal >= ND) {
	        System.out.println("Seu ataque acertou!\n");
	        int rolarDano = rolarDano();
	        int modificador = atributo();
	        System.out.println("Digite seu bônus de ataque.(Se não tiver, digite 0):");
	        int bonus = scan.nextInt();

	        int danoTotal = rolarDano + modificador + bonus;
	        System.out.println("Seu dado foi " + rolarDano);
	        System.out.println("Seu modificador de atributo é " + modificador + "\ne seu bônus de ataque é " + bonus);
	        System.out.println("Você causou " + danoTotal + " de dano.\n");
	    } else {
	        System.out.println("Seu ataque não acertou!");
	    }
	}

	public void danoArea() {
    int dano = rolarDano();
}
	
	
	public int rolarDano() {
		    System.out.println("Selecione o dado de dano:\n1 - D4\n2 - D6\n3 - D8\n4 - D10\n5 - D12");
		    int dadoEscolhido = scan.nextInt();
		    int faces = 0; 
		    switch (dadoEscolhido) {
		        case 1: faces = 5;
		        	break;
		        case 2: faces = 7;
		        	break;
		        case 3: faces = 9;
		        	break;
		        case 4: faces = 11;
		        	break;
		        case 5: faces = 13;
		        	break;
		        default:
		            System.out.println("Dado inválido");
		            return 0;
		    }
		    System.out.println("Quantos dados você quer rolar?");
		    int quantidade = scan.nextInt();

		    int soma = 0;
		    for (int i = 1; i <= quantidade; i++) {
		        int rolagem = ran.nextInt(1, faces);
		        soma += rolagem;
		        System.out.println("Rolagem " + (i) + ": " + rolagem +"\n");
		    }
		    System.out.println("Dano total: " + soma +"\n____________________________________");
		    return soma;
	}

}
