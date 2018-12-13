package Exercices;

import java.util.Scanner;

public class Exercice16 {
	/**
	 * Exercice 16
	 * demandez la saisie d'un mot
	 * Déterminez si ce mot est un palindrome
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot.");
		String mot = sc.nextLine();
		int palindrome = 0;//compteur du nombre de lettres identiques.
		for (int i = 0; i < mot.length(); i++) {//boucle qui parcour le mot.
			if (mot.charAt(i) == mot.charAt(mot.length()- 1 - i)) {//condition qui compare les lettres opposées entre elles en parcourant tout le mot dans les deux sens.
				palindrome++;//a chaque bonne comparaison ajoute 1 au compteur.
			} else {
			}
		}
		if (palindrome == mot.length()) {//si le compteur = à la taille du mot.
			System.out.println("c'est un palindrome.");
		} else {
			System.out.println("ce n'en est pas un.");
		}
		sc.close();
	}

}
