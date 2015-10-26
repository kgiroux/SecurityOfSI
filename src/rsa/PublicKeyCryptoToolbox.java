package rsa;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import rsa.EEAResult;

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
		if(b.compareTo(new BigInteger("0")) == 0)
		{
			return new EEAResult(a, 
					b, 
					a, 
					new BigInteger("1"), 
					new BigInteger("0"));
		}
		else
		{
			//Compute previous result of the algorithm
			EEAResult eeaPrevResult = extendedEuclideanAlgorithm(b,b.mod(a));
			
			//Return d, y, x
			return new EEAResult(eeaPrevResult.getA(), 
					eeaPrevResult.getB(), 
					eeaPrevResult.getD(), 
					eeaPrevResult.getY(), 
					eeaPrevResult.getX().subtract((a.divide(b)).multiply(eeaPrevResult.getY())));
		}
	}

	static public BigInteger modExp(BigInteger a, BigInteger b, BigInteger m) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/

		// Remove this line!
		return new BigInteger("0");
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
