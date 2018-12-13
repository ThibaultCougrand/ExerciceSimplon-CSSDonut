package Exercices;

import java.util.Scanner;

public class Exercice18 {
	/**
	 * Exercice 18
	 * Demandez une saisie d'un entier entre 0 et 256 puis afficher cet entier et sa conversion en char
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(Character.toChars(number));//retourne une methode pour retourner le char de mon number pris en param.
		char c = (char)number;//convertion de mon number en char.
		System.out.println(c);//retour de mon char.
		sc.close();

	}

}
