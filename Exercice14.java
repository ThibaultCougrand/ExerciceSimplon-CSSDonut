package Exercices;

import java.util.Scanner;

public class Exercice14 {
	/**
	 * Exercice 14
	 * 1.demander à un utilisateur de saisir une chaine de caractère
	 * 2.retournez cette chaine en majuscule
	 * 3.retournez cette chaine avec la première lettre en majuscule
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot ou une phrase");
		String saisi = sc.nextLine();
		System.out.println(saisi.toUpperCase());
		System.out.println(saisi.substring(0, 1).toUpperCase() + saisi.substring(1));
		sc.close();
	}

}
