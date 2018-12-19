package exercices03a23;

public class Exercice12 {
	/**
	 * Exercice 12
	 * Déclarez une variable de type tableau de 5 entiers.
	 * Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10.
	 * Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa position.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tab1 = new int[5];//nouveau tableau de 5 entiers.
		for (int i = 0; i < tab1.length; i++) {//boucle qui parcourt le tableau.
			double randomD = Math.random() * 11;//genère un nombre aléatoire entre 0 et 10.
			int random = (int) randomD;//converti ce nombre en entier.
			tab1[i] = random;//intègre les nombres aléatoire au tableau a chaque passage de la boucle à la position index = à i.
			if ((tab1[i] > 3) && (tab1[i] < 5)) {//si la valeur stocké dans le tableau est égale à 4
				System.out.println("La valeur 4 est stocké dans mon tableau à la position " + (i + 1));//on l'affiche à l'écran avec ça position.
			}
		}

	}

}
