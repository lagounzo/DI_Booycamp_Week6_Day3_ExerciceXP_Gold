/**
 * @author N'ZO LAGOU
 * 
 
Exercise 2 : Natural Logarithm

Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n

where n is a positive integer and input by user.
 */



package gold;

import java.util.Scanner;

public class Logarithme {
	public static void executable() {
		
		System.out.println("Enter a number ");
		
		Scanner sc = new Scanner(System.in);
		
		
		int number = sc.nextInt();
		
		System.out.println("le logarithme  est " + number + logari(number) );
		
	}
	
	public static double logari(int n) {
		double sumlogarit = 0;
		for (int i = 1; i <= n; i++) {
			double log = (i % 2 == 0) ? -1/i : 1/i;
			sumlogarit += log;
		}
		//System.out.println("log(4) " + sumlogarit);
		return n;
	}
}
