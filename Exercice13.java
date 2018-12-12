package Exercices;

import java.util.Scanner;

public class Exercice13 {
	/**
	 * Exercice 13
	 * 1.demander à un utilisateur de saisir une chaine de caractère
	 * 2.demander à cet utilisateur de saisir une lettre
	 * 3.calculez le nombre de fois où cette lettre est présente dans la chaine saisie en 1.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//init du scanner.
		System.out.println("Veuillez saisir une un mot ou une phrase.");
		String saisi = sc.nextLine();
		System.out.println("Maintenant saisissez une lettre.");
		String saisiL = sc.nextLine();
		char saisiLC = saisiL;
		int count = 0;
		for (int i = 0; i < saisi.length(); i++) {
			char src = saisi.charAt(i);
			if (src == saisiLC) {
				count++;
			}
		}
		System.out.println("il y à "+ count +" "+ saisiL +" dans votre saisi");
		sc.close();
	}
}
