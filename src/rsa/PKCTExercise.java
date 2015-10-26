package rsa;

import java.math.BigInteger;
import java.util.Vector;

public class PKCTExercise {
	
	void eeaResultExercise() {
		
		System.out.println("\nExercise 5:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 5a+b below this comment!
		 ************************************************************/
		EEAResult eearesult = new EEAResult(new BigInteger("8002109"), new BigInteger("7186131"), new BigInteger("1"), new BigInteger("-2996671"), new BigInteger("3336940"));
		System.out.println("Prime Number : " + eearesult.isRelativlyPrime());
		System.out.println("Inverse result : " + eearesult.getInverse());
	}

	void euclidExercise() {

		System.out.println("\nExercise 6:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 6b+c below this comment!
		 ************************************************************/
		
	}
	
	void modExpExercise() {
		System.out.println("\nExercise 7:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 6b+c below this comment!
		 ************************************************************/

		
	}
	
	void randomNumbers() {
		System.out.println("\nExercise 8:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 8c below this comment!
		 ************************************************************/

	}

	void primalityTest() {
		System.out.println("\nExercise 9:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 9c+e below this comment!
		 ************************************************************/

	}
	
	void run() {
		/*
		 * Uncomment the method after completion of the
                 * respective exercise!
		 */
		//eeaResultExercise();
		//euclidExercise();
		//modExpExercise();
		//randomNumbers();
		//primalityTest();
	}
	
	public static void main(String[] args) {

		PKCTExercise m = new PKCTExercise();
		m.run();
	}

}
