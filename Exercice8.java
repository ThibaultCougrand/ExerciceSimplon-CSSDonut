package Exercices;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jeunes = 0;// une variable pour stoquer les personnes de moins de 20 ans.
		for (int i = 0; i < 20; i++) {// une boucle qui se lance 20 fois.
			System.out.println("Personne " + (i + 1));
			System.out.println("Veuillez saisir votre age");
			int age = sc.nextInt();// saisi d'age de l'utilisateur.
			if ((age < 20)&&(age > 0)) {//si la personne à moins de 20 ans et plus de 0 ans,
				jeunes++;				//je la stoque dans ma variable mineur.
			} else if ((age < 1)||(age > 100)) {// si elle saisi un age improbable.
				System.out.println("tu as vraiment " + age + " ans ou tu te moques de moi");
				System.out.println("sérieusement saisis un âge corecte");
				i--;//on lui laisse re-rentrer sa saisi.
			} else {// si elle à entre 20 et 99 ans rien ne se passe.
			}
		}
		System.out.println("il y à " + jeunes + " personnes de moins de vingt ans");
		sc.close();
	}
}
