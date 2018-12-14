package Exercices;

public class Exercice20 {
	/**
	 * Exercice20
	 * Déclarez et initialiser un tableau d'entiers à deux dimensions, dont la taille est deux pour la première dimension et
	 * deux aussi pour la seconde dimension. Choisissez les valeurs à mettre dans ce tableau .
	 * Ecrivez le programme java qui lit puis qui affiche ce tableau.
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] tab2D = new int[2][2];//init d'un tableau en 2D.
		for (int i = 0; i < tab2D.length; i++) {//boucle qui parcourt la base du tableau.
			for (int j = 0; j < tab2D[i].length; j++) {//boucle qui parcourt les tableaux dans les tableaux.
				double random = Math.random() * 10;//on créer une variable qui génère des chiffres aléatoires.
				tab2D[i][j] = (int)random;//on entre dans chaque j de chaques i un chiffre converti en int. 
				System.out.print("["+tab2D[i][j]+"]"+" ");//on affiche le contenu du tableau 2D.
			}
		}
	}
}
