package Exercices;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		System.out.println("Bonjour, Quel est votre nom?");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Vous vous appelez " + str );
	}

}
