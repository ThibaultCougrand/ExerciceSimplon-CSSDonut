package Exercices;

import java.util.Scanner;

public class Exercice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisisez un nombre à multiplier:");
		int X = sc.nextInt(); // je récupère le chiffre à multiplier.
		System.out.println("Saisissez maintenant jusqu'a combien vous allez le multiplier:");
		int N = sc.nextInt(); // je récupère le nombre pour savoir jusqu'a combien le multiplier.
		for (int i = 1; i <= N; i++) { // initialise i à 1 pour qu'il commence à X fois 1 et je fais tant que N est supérieur ou egale à i tu augmente i.
			System.out.println(X + " fois " + i + " égale " + i * X); // je multiplie X par i jusqu'à ce que i = N.
		}
		sc.close();
		

	}

}
