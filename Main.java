package ProjetoDnD;

public class Main {

	public static void main(String[] args) {
						   //Nome do personagem,for,des,con,int,sab,car;
		Personagem p1 = new Personagem("Albion", 4, 1, 3, 0, 0, 0, 2);
		System.out.println(p1.toString());
		System.out.println("____________________________________\n");
		Personagem p2 = new Personagem("Baltazar", 0, 2, 1, 1, 1, 3, 2);
		System.out.println(p2.toString());
		System.out.println("____________________________________\n");
		
		p1.rolarDado();
		p2.rolarDado();
	}

}