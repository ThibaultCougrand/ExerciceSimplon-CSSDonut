package Exercices;

import java.util.Scanner;

public class Exercice15 {
	/**
	 * Exercice 15
	 * Demandez la saisie d'un mot à l'utilisateur
	 * Afficher les trois derniers caractères de ce mot
	 * Afficher ce mot sans les deux premier caractère et sans les trois dernier caractères
	 * (NB : Gérez le cas où le mot n'est assez long )
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;//var de boucle.
		while (i == 0) {//boucle pour relancer la saisi en cas d'erreur.
			System.out.println("Veuillez entrer un mot de minimum 5 lettres.");
			String mot = sc.nextLine();//saisi du mot.
			if (mot.length() > 4) {//si le mot est d'au moins 5 lettres
				System.out.println(mot.substring((mot.length() - 3)));//on affiche les 3 dernières lettres du mot.
				System.out.println(mot.substring(2, (mot.length() - 3)));//on affiche le mot de la 3ème lettre à la 3ème avant la fin.
				i++;//on sort de la boucle.
			} else {//sinon
				System.out.println("Votre mot fait moins de 5 lettres.");//message d'erreur.
			}
		}
		sc.close();
	}

}
