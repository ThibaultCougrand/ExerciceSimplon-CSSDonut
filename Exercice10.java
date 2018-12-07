package Exercices;

public class Exercice10 {

	public static void main(String[] args) {
		int[] tab1 = {4,67,25,87};//tableau nombres entiers.
		double[] tab2 = {4.5,67,25.50,87.00};//tableau nombres décimaux.
		String[] tab3 = {"r","2","?","+"};//tableau de String.
		String[] tab4 = {"Robert","Noemie","David","Bertrand"};//tableau de String avec des noms.
		System.out.println(tab1[0]);//affiche la première valeur de tab1.
		tab1[2] = 42;//remplace la troisième valeur de tab1 par 42
		for (int i = 0;i <= 3;i++) {//boucle de 4 tours.
			System.out.println(tab3[i]);//qui affiche les éléments du tableau = à la valeur du passage de la boucle.
		}
		System.out.println(tab1.length);//affiche la taille de tab1.
	}

}
