package ProjetoDnD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class InstanciaPersonagem {

	
	public void instanciaPersonagem() {
        List<Personagem> ordemCombate = new ArrayList<>();

        Personagem p1 = new Personagem("Uldrim", 4, 2, 3, 1, 1, 1, 2, 2);
        Personagem p2 = new Personagem("Baltazar", 0, 2, 1, 1, 1, 3, 2, 2);

        ordemCombate.add(p1);
        ordemCombate.add(p2);

        System.out.println("=== ROLAGEM DE INICIATIVA ===");
        for (Personagem p : ordemCombate) {
            p.iniciativa();
        }

        Collections.sort(ordemCombate, new Comparator<Personagem>() {
            @Override
            public int compare(Personagem p1, Personagem p2) {
                return p2.getResultadoIniciativaCombate() - p1.getResultadoIniciativaCombate();
            }
        });

        System.out.println("____________________________________");
        System.out.println("ORDEM DO COMBATE:");
        for (Personagem p : ordemCombate) {
            System.out.println(p.getNome() + ": " + p.getResultadoIniciativaCombate());
        }
        System.out.println("____________________________________\n");

        for (Personagem p : ordemCombate) {
            p.rolarDado();
            System.out.println("____________________________________\n");
        }
    }
}
