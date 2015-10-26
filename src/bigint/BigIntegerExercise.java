package bigint;

import java.math.BigInteger;
import java.security.SecureRandom;

public class BigIntegerExercise {

	public BigIntegerExercise() {
		//BigInteger a = new BigInteger("79341182948930145");
	
	}

	void expression() {

		System.out.println("\nExercise 2:");
		System.out.println("===========\n");
		/************************************************************
		 * Insert the code of Exercise 2 below this comment!
		 ************************************************************/

		BigInteger a = new BigInteger("512"),b = new BigInteger("102"),c = new BigInteger("3"),d = new BigInteger("761"),result;
		result = ((a.multiply(b)).subtract(c)).divide(c).add((d.multiply(d)).subtract((a.subtract(b))));
		
		
	}

	void comparison() {
		System.out.println("\nExercise 3:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 3 below this comment!
		 ************************************************************/

	}

	void randomNumbers() {
		System.out.println("\nExercise 4:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 4 below this comment!
		 ************************************************************/

	}

	public void run() {
		/*
		 * Uncomment the method after the implementation!
		 */
		//expression();
		//comparison();
		//randomNumbers();
	}

	public static void main(String[] args) {
		BigIntegerExercise m = new BigIntegerExercise();

		m.run();
	}

}
