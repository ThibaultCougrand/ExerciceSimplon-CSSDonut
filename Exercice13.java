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
		String saisi = sc.nextLine();//saisi la chaine.
		System.out.println("Maintenant saisissez une lettre.");
		String saisiL = sc.nextLine();//saisi la lettre à chercher.
		char saisiLC = saisiL.charAt(0);//converti en char la lettre de ma saisi de lettre à la position 0.
		int count = 0;//conteur du nombre de fois la lettre.
		for (int i = 0; i < saisi.length(); i++) {//parcoure toute la string.
			char src = saisi.charAt(i);//converti la lettre à la position i de ma phrase en char pour la comparer à ma lettre.
			if (src == saisiLC) {//maintenant je les compare et si elles sont identiques.
				count++;//+1 au compteur.
			}
		}
		System.out.println("il y à "+ count +" "+ saisiL +" dans votre saisi");//on affiche combien de fois la lettre est dans la phrase.
		sc.close();
	}
}
