/**
 * @author N'ZO LAGOU
 * Exercice 3 : Compter Des Nombres

Écrivez un programme pour entrer les nombres jusqu'à ce que l'utilisateur 
le veuille et à la fin, il devrait afficher le nombre de positifs, de négatifs et de zéros saisis.
 */

/*Ce code utilise une boucle while (true) pour continuer à demander à l'utilisateur d'entrer
 *  des nombres jusqu'à ce que l'utilisateur entre 0. Chaque nombre entré est vérifié pour déterminer 
 *  s'il est positif, négatif ou nul et le compteur approprié est incrémenté en conséquence. 
 * À la fin, le programme affiche le nombre de nombres positifs, négatifs et nuls saisis.*/

package gold;

import java.util.Scanner;

public class Comptenumber {

	public static void tanque() {

		Scanner sc = new Scanner(System.in);
		double input;
		int positifNumber = 0;
		int negatiffNumber = 0;
		int zeroNumber = 0;

		System.out.println("veuillez entrer un nombre ! ");

		do {
			input = sc.nextDouble();
			if (input > 0) {
				positifNumber++;
			} else if (input < 0) {
				negatiffNumber++;
			} else {
				zeroNumber++;
			}

		} while (false);
		
		// pour afficher les resultats
		System.out.println("The positif number is : " + positifNumber);
		System.out.println("The negatif number is : " + negatiffNumber);
		System.out.println("The zero number is : " + zeroNumber);
	}
}
