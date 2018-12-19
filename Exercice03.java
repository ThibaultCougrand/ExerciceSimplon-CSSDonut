package exercices03a23;

import java.util.Scanner;

public class Exercice03 {

	public static void main(String[] args) {
		System.out.println("Bonjour, Quel est votre nom?");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Bonjour " + str + " !");
		scan.close();
	}

}
