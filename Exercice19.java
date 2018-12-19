package exercices03a23;

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
		int[] tab1 = new int[8];//initialise un tableau de 8 cases.
		for (int i = 0; i < tab1.length; i++) {//boucle qui parcourt le tableau.
			double random = Math.random()*101;//variable qui génère un nombre de 0 à 100.
			tab1[i] = (int)random;//le converti en int et l'insert dans chaques cases du tableau.
			System.out.print(tab1[i]+" ");//affiche le tableau.
		}
		System.out.println("\n");
		for (int i = 0; i < tab1.length; i++){//boucle qui parcourt mon tableau 8 fois.
			for (int j = 1; j < tab1.length; j++) {//boucle qui parcourt mon tableau à partir de la case 2.
				if (tab1[j-1] > tab1[j]) {//si la case à gauche de ma case j est > à j alors
					int vide = tab1[j-1];//on créer une variable sur j-1,
					tab1[j-1] = tab1[j];// on met j-1 sur j,
					tab1[j] = vide;//et j sur la case où été j-1.
				}
			}
		}
		
		for (int i = 0; i < tab1.length; i++) {//on affiche le tableau une fois trié.
			System.out.print(tab1[i]+ " ");
		}
		
	}

}
