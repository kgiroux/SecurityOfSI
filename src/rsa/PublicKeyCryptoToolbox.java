package rsa;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Vector;

public class PublicKeyCryptoToolbox {
	// / Secure pseudo random number generator
	SecureRandom prng;

	public PublicKeyCryptoToolbox() {
		// Create a new prng instance
		prng = new SecureRandom();
	}

	public static EEAResult extendedEuclideanAlgorithm(BigInteger a, BigInteger b) {

		/************************************************************
		 * Insert the code of Exercise 6a below this comment!
		 ************************************************************/

		// Remove this line!
		return new EEAResult(new BigInteger("0"), 
				new BigInteger("0"), 
				new BigInteger("0"), 
				new BigInteger("0"), 
				new BigInteger("0"));
	}

	private static ArrayList<Integer> listBit(BigInteger a){
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Binary representation of " + a + ": ");
		for (int i=a.bitLength()-1; i>=0; i--) {
			if (a.testBit(i)==true) {
				System.out.print("1");
				list.add(1);
			} else {
				System.out.print("0");
				list.add(0);
			}
		}
		System.out.println("");
		return list;
	}
	
	static public BigInteger modExp(BigInteger a, BigInteger b, BigInteger m) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/
		ArrayList<Integer> list = listBit(b);
		for(int i : list ){
			
		}
	}

	public BigInteger randomInteger(int bit_length) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/

		// Remove this line!
		return new BigInteger("0");
	}

	public BigInteger randomInteger(BigInteger n) {

		/************************************************************
		 * Insert the code of Exercise 7b below this comment!
		 ************************************************************/

		// Remove this line!
		return new BigInteger("0");
	}

	public boolean witness(BigInteger a, BigInteger n) {

		/************************************************************
		 * Insert the code of Exercise 8a below this comment!
		 ************************************************************/

		// Remove this line!
		return false;
	}

	public boolean millerRabinTest(BigInteger n, int s) {

		/************************************************************
		 * Insert the code of Exercise 8b below this comment!
		 ************************************************************/
		
		// Remove this line!
		return false;
	}

	public BigInteger randomPrime(int bit_length, int s) {

		/************************************************************
		 * Insert the code of Exercise 8d below this comment!
		 ************************************************************/
		
		// Remove this line!
		return new BigInteger("0");
	}

}
