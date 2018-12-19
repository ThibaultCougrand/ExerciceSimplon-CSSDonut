package exercices03a23;

import java.util.Scanner;

public class Exercice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jeunes = 0;//initialisation des moins de 20 ans.
		int moyens = 0;//initialisation des 20 à 40 ans.
		int vieux = 0;//initialisation des plus de 40 ans.
		int i = 0;//variable qui servira à re-fermer la boucle.
		int j = 0;//variable qui va compter le nombre de passage dans la boucle.
		while (i < 1) {//s'arrète que i est augmenté.
			System.out.println("Personne " + (j + 1));
			System.out.println("Veuillez saisir votre age");
			int age = sc.nextInt();//utilisateur saisi son age.
			if (age < 1) {//si il à moins d'un an,
				System.out.println("Sérieusement tu as vraiment moins d'un an ?");
				j--;//on recommence la saisi.
			} else if ((age > 0)&&(age < 20)) {//si il à entre 1 et 19 ans,
				jeunes++;//on l'ajoute aux jeunes.
			} else if ((age >= 20)&&(age <= 40)) {//si il à entre 20 et 40 ans,
				moyens++;//on l'ajoute aux moyens.
			} else if ((age >40)&&(age <100)) {//si il à entre 41 et 100 ans,
				vieux++;//on l'ajoute aux vieux.
			} else {//si il à plus de 99 ans,
				i++;//on sort de la boucle.
			}
			j++;//a chaque passage de boucle on ajoute 1 au compteur de tour.
		}
		System.out.println("Parmis les personnes ayant saisi leurs âge il y à " + jeunes + 
		" personnes de moins de moins de 20 ans.");
		System.out.println("Il y à également " + moyens + " personnes qui ont entre 20 et 40 ans.");
		System.out.println("Ainsi que " + vieux + " personnes de plus de 40 ans.");
		System.out.println("Et bien sur notre centenaire qui à rentrer son age en " + j + "ème.");
		sc.close();
	}

}
