package Exercices;

public class Exercice21 {
	/**
	 * Exercice 21
	 * Ecrivez le programme Java qui lit deux matrices carrées dont la taille est fixée par une constante, en calcule la
	 * somme puis affiche le résultat .
	 * Indice : la somme de deux matrices se fait élément par élément . Si A et B sont les deux matrices dont C est la
	 * somme, alors pour toute paire d'indices i et j, Cij=Aij+Bij
	 * @param args
	 */
	public static void main(String[] args) {
		final int mat1 = 2;
		final int mat2 = 5; 
		int[][] matrice1 = new int[mat1][mat2];
		int[][] matrice2 = new int[mat1][mat2];
		int[][] matriceRes = new int[mat1][mat2];
		for (int i = 0; i < mat1; i++) {
			for (int j = 0; j < mat2; j++) {
				double random1 = Math.random() * 10;
				double random2 = Math.random() * 10;
				matrice1[i][j] = (int)random1;
				matrice2[i][j] = (int)random2;
				matriceRes[i][j] = matrice1[i][j] + matrice2[i][j];
			}
		}
		System.out.println("Voici le premier tableau");
		for (int i = 0; i < mat1; i++) {
			for (int j = 0; j < mat2; j++) {
				System.out.print(matrice1[i][j]+" ");
			}
		}
		System.out.println("\nvoici le deuxième");
		for (int i = 0; i < mat1; i++) {
			for (int j = 0; j < mat2; j++) {
				System.out.print(matrice2[i][j]+" ");
			}
		}
		System.out.println("\net la somme des deux");
		for (int i = 0; i < mat1; i++) {
			for (int j = 0; j < mat2; j++) {
				System.out.print(matriceRes[i][j]+" ");
			}
		}
	}
}
