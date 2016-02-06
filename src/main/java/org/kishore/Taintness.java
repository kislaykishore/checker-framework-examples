/**
 * 
 */
package org.kishore;

import java.util.Scanner;

import org.checkerframework.checker.tainting.qual.Untainted;

/**
 * @author kishore
 *
 */
public class Taintness {
	public static void main(String [] args){
		try (Scanner sc = new Scanner(System.in)) {
			@Untainted int taintedDivisor = validate(sc.nextInt());
			int dividend = sc.nextInt();
			int quotient = getQuotient(dividend, taintedDivisor);
			System.out.println(quotient);
		}
	}
	
	static @Untainted int validate(int a){
		int val;
		if(a == 0){
			val = 1;
		}
		else val = a;
		@SuppressWarnings("tainting")
		@Untainted int ret = val;
		return ret;
	}
	static int getQuotient(int dividend, @Untainted int divisor){
		return dividend/divisor;
	}
}
