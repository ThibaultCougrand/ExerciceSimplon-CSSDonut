package Exercices;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int table = scan.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(table + " fois " + i + " est égale à " + i * table);
		}
	scan.close();
	}
}
