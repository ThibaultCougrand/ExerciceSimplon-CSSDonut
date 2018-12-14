package Exercices;

import java.util.Scanner;

public class Exercice17 {
	/**
	 * Exercice 17
	 * Imaginez une application de jeu du pendu.
	 * Le mot à deviner fait 10 lettre maximum
	 * L'utilisateur doit deviner ce mot en proposant à chaque tour une lettre ou une solution.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mot = "";//on initialise le mot choisi
		int saisiMot = 0;
		while (saisiMot == 0) {//boucle pour recommencer la saisi du mot en cas d'erreur.
			System.out.println("Joueur 1 veuillez saisir un mot entre 3 et 10 lettres.");
			mot = sc.nextLine();
			if (mot.length() < 11 && mot.length() > 2) {//si le mot fais entre 3 et 10 lettres
				saisiMot++;//on sort de la boucle.
			} else {//sinon
				System.out.println("Votre saisi n'est pas bonne.");//erreur.
			}
		}
		System.out.println("\n\n\n\n\n\n\n\nvoici le mot à deviner:");
		String[] motHide = new String[mot.length()];//init du tableau pour stocker le mot caché de la taille du mot saisi..
		for (int i = 0; i < mot.length(); i++) {//boucle qui ajout des etoiles dans mon tableau.
			motHide[i] = " *";
			System.out.print(motHide[i]);
		}
		System.out.println("\n");
		System.out.println("Joueur 2");
		int error = 0;
		while (error < 10) {//boucle du joueur 2 qui se stop au bout de 10 erreurs.
			System.out.println("vous avez fait " + error +" erreurs, attention à 10 c'est fini");
			String essai = "";//init lettre entré.
			String essaiMot = "";//init tentative saisi du mot.
			int verifMot = 0;//compteur verif tentative saisi du mot.
			System.out.println("Connaissez vous le mot ? tapez 'entrer' pour non.");
			essaiMot = sc.nextLine();
			for (int i = 0; i < mot.length(); i++) {//boucle qui parcourt le mot.
				if (essaiMot.length() == 0) {//si l'entrée est vide
					break;//on sort de la boucle.
				} else if (essaiMot.charAt(i) == mot.charAt(i)) {//si la lettre pos i des deux mots sont identiques
					verifMot++;//on ajoute 1 au compteur verif.
				} else {//sinon
					error++;//1 erreur.
				}
			}
			if (verifMot == mot.length()) {//si verfi mot = taille du mot. 
				break;//fin du jeu on sort de la boucle.
			}
			int saisiLettre = 0;//variable de la boucle.
			while (saisiLettre == 0) {//boucle pour la saisi de la lettre.
				System.out.println("Saisissez une lettre.");
				essai = sc.nextLine();
				if (essai.length() == 1) {//si on tape 1 lettre 
					saisiLettre++;//on sort.
				} else {//sinon erreur.
					System.out.println("Vous devez saisir UNE lettre !");
				}
			}
			int count = 0;
			for (int i = 0; i < mot.length();i++) {//boucle verif saisi de lettre est dans le mot.
				if (mot.charAt(i) == essai.charAt(0)) {//si elle y est
					motHide[i] = " " + essai;//on l'ajoute au tableau caché.	
				} else {//sinon
					count++;//compteur pour erreur.
				}
			}
			if (count == mot.length()) {//si compteur = taille du mot
				error++;//1 erreur.
			}
			for (int i = 0; i < mot.length(); i++) {//boucle qui affiche le mot cacher avec les lettres trouvées.
				System.out.print(motHide[i]);
			}
			int verifTrouvé = 0;//compteur verif si le mot est trouvé.
			System.out.println("\n");
			for (int i = 0; i <mot.length(); i++) {//parcour tout le tableau
				if (motHide[i] != " *") {//si il n'y à plus d'étoile à l'index i
					verifTrouvé++;//+1 au compteur
				}
			}
			if (verifTrouvé == mot.length()) {//si compteur verif = taille du mot
				break;//fin du jeu.
			}
		}
		System.out.println("Bravo vous avez trouver le mot!!!");
		sc.close();
	}
}