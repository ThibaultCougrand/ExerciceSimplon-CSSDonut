package Exercices;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Boolean verif = true;
		Scanner sc = new Scanner(System.in);
		
		while (verif) {
			
			System.out.println("Saisir un premier nombre compris entre -1000 et 1000");
			int a = sc.nextInt();
			System.out.println("Saisir un deuxième nombre compris entre -1000 et 1000");
			int b = sc.nextInt();
			System.out.println("Saisir un opérateur (+, -, * ou /)");
			sc.nextLine();	
			String operator = sc.nextLine();
		
			if ((a >= -1000) && (a <= 1000) && (b >= -1000) && (b <= 1000)) {
				switch (operator) {
					case "+" : System.out.println(a + b);
					verif = false;
					break;
					case "-" : System.out.println(a - b);
					verif = false;
					break;
					case "*" : System.out.println(a * b);
					verif = false;
					break;
					case "/" :
						if ((a != 0) && (b != 0)) {
							System.out.println(a / b);
							verif = false;
						} else {
							System.out.println("On ne peut pas faire de division par 0");
						}
					break;
					default : System.out.println("L'opérateur n'est pas valide je fais donc une addition");
					System.out.println(a + b);
					break;
				}
			} else {
				System.out.println("Au moins une de vos saisis ne sont pas compris entre 1000 et -1000");
			}
		}
	sc.close();
	}
}
