/**
 * @author N'ZO LAGOU
 * Exercice 1 : Série De Fibonacci


Ecrire un programme pour imprimer des séries de Fibonacci de n termes où n est entré par l'utilisateur :
0 1 1 2 3 5 8 13 24 .....
 */

package gold;

public class Fibonacci {
	public static void affichage() {
		int n1 = 0, n2 = 1, n3 , i, cpt = 10;
		System.out.print(n1 + " " +n2 );
		
		for (int j = 2; j < cpt; ++j) {
			n3 = n1 + n2 ;
			System.out.print(" " + n3);
			n1 = n2; 
			n2 = n3;
			//n3 = n4;
		
			
			
		}
		
		
	}

}
