package Exercices;

import java.util.Scanner;

public class Exercice24 {
	/**
	 * Exercice 24
	 * Demandez à l'utilisateur de saisir un nombre
	 * Ecrivez la méthode qui retourne cette valeur élevé à la puissance 3.
	 * utilisez cette méthode pour retourner la saisie de l'utilisateur à la puissance 3.
	 * @param args
	 */
	public static int puissance3(int nombre) {//methode qui prend mon nombre en paramètre.
		int calc = nombre * nombre * nombre;//calcul de puissance 3 du nombre.
		return calc;//retourne le resultat.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez entrer un nombre");
		int nombreSaisi = sc.nextInt();
		System.out.println("voici votre nombre puissance 3");
		System.out.println(puissance3(nombreSaisi));//appel de ma methode avec ma saisi en paramètre.
		sc.close();
	}

}
