package Exercices;

import java.util.Scanner;

public class Exercice23 {
	/**
	 * Exercice 22
	 * (Upgrade de l'exercice 14)
	 * Demandez à l'utilisateur de saisir un mot
	 * Ecrivez une méthode qui prend en paramètre une chaine de caractère et qui retourne cette chaine en majuscule.
	 * Utilisez cette méthode pour retourner à l'utilisateur son mot en majuscule.
	 * @param args
	 */
	public static String upToMaj(String mot) {//ma methode qui prend une string en paramètre
		return mot.toUpperCase();//et transforme cette string en majuscule
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un mot");
		String motSaisi = sc.nextLine();
		System.out.println(upToMaj(motSaisi));//j'applique ma methode à ma saisi.
		sc.close();
	}

}
