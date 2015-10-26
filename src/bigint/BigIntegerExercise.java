package bigint;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;

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
		System.out.println(result);
		
	}

	void comparison() {
		System.out.println("\nExercise 3:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 3 below this comment!
		 ************************************************************/
		BigInteger a = new BigInteger("781"), b = new BigInteger("12891");
		
		//Compare
		if(a.compareTo(b) == 0)
			System.out.println("b="+b+" is equal to a="+a+".");
		else if(a.compareTo(b) < 0)
			System.out.println("b="+b+" is greather than a="+a+".");
		else if(a.compareTo(b) > 0)
			System.out.println("a="+a+" is greather than b="+b+".");
	}

	void randomNumbers() {
		System.out.println("\nExercise 4:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 4 below this comment!
		 ************************************************************/
		SecureRandom prng = new SecureRandom();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(64);
		list.add(128);
		list.add(256);
		list.add(512);
		list.add(1024);
		list.add(2048);
		for (int i : list)
			System.out.println(new BigInteger(i,prng));
	}

	public void run() {
		/*
		 * Uncomment the method after the implementation!
		 */
		expression();
		comparison();
		randomNumbers();
	}

	public static void main(String[] args) {
		BigIntegerExercise m = new BigIntegerExercise();

		m.run();
	}

}
