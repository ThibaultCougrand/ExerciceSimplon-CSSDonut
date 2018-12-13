package Exercices;

public class Exercice19 {
	/*
	 * Exercice 19 Tri à bulle
	 * Déclarez et initialisez un tableau de 8 entiers.
	 * Remplir aléatoirement ce tableau avec des nombres entre 0 et 100.
	 * Afficher ce tableau en l'état.
	 * Ecrivez l'algorithme qui trie un tableau d'entiers dans l'ordre croissant.
	 * Ré-afficher le tableau une fois trié.
	 */
	public static void main(String[] args) {
		int[] tab1 = new int[8];
		for (int i = 0; i < tab1.length; i++) {
			double random = Math.random()*101;
			tab1[i] = (int)random;
			System.out.print(tab1[i]+" ");
		}
		System.out.println("\n");
		for (int i = 0; i < tab1.length; i++){
			for (int j = 1; j < tab1.length; j++) {
				if (tab1[j-1] > tab1[j]) {
					int vide = tab1[j-1];
					tab1[j-1] = tab1[j];
					tab1[j] = vide;
				}
			}
		}
		
		for (int i = 0; i < tab1.length; i++) {
			System.out.print(tab1[i]+ " ");
		}
		
	}

}
