package Exercices;

/**
 * Exercice 22
 * Ecrivez le programme java qui affiche la bannière suivante :
 * Ecrivez ensuite le programme principal qui appelle cette procédure
 * @param args
 */

public class Exercice22 {
	public static void affichBanière() {//methode public(utilisable dans d'autres class) static(pour pouvoir la réutiliser dans le main) void(sans retour) affichBanière(nom de ma méthode) ()(paramètre de la methode)
		String banière = "*************************************************************\n" + 
				"**\n" + 
				"**\n" + 
				"**\n" + 
				"BIENVENUE\n" + 
				"**\n" + 
				"**\n" + 
				"**\n" + 
				"*************************************************************";
		 System.out.println(banière);
	}
	public static void main(String[] args) {
		affichBanière();//on appelle la methode.
		
	}

}
