package rsa;
/**
 * @author Kévin Giroux & Kévin Pace
 */
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
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
		if(b.compareTo(BigInteger.ZERO) == 0)
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
			EEAResult eeaPrevResult = extendedEuclideanAlgorithm(b,a.mod(b));
			
			//Return d, y, x
			return new EEAResult(a, 
					b, 
					eeaPrevResult.getD(), 
					eeaPrevResult.getY(), 
					eeaPrevResult.getX().subtract((a.divide(b)).multiply(eeaPrevResult.getY())));
		}
	}
	
	static public BigInteger modExp(BigInteger a, BigInteger b, BigInteger m) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/
		BigInteger d = new BigInteger("1");
		for (int i=b.bitLength()-1; i>=0; i--) {
			// Computing d by d and get the modulo of this result => store in d
			d = d.multiply(d).mod(m);
			// Test if the bit n° I is 1 
			if (b.testBit(i)==true) {
				// Computing d by a and get the modulo of this result => store in d
				d = d.multiply(a).mod(m);
			}
		}
		return d;
	}

	public BigInteger randomInteger(int bit_length) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/
		return new BigInteger(bit_length,prng);
	}	

	public BigInteger randomInteger(BigInteger n) {

		/************************************************************
		 * Insert the code of Exercise 7b below this comment!
		 ************************************************************/
		int nbBit = n.bitLength();
		BigInteger result;
		do{
			// Create a random integer between one and n
			result = new BigInteger(nbBit,prng);
		}while(result.compareTo(BigInteger.ONE) <0 || result.compareTo(n) > 0);
		return result;
	}

	public boolean witness(BigInteger a, BigInteger n) {
		
		/************************************************************
		 * Insert the code of Exercise 8a below this comment!
		 ************************************************************/
		// This function return true if the number is composite and false if the number is prime
		BigInteger d = BigInteger.ONE, nMinus1 = n.subtract(BigInteger.ONE);
		BigInteger x;
		
		for (int i= nMinus1.bitLength(); i>=0; i--) 
		{
			
			x = d;
			d = (d.multiply(d)).mod(n);
			if((d.compareTo(BigInteger.ONE) == 0) && (x.compareTo(BigInteger.ONE) != 0) && (x.compareTo(nMinus1) != 0))
				return true;
			if(nMinus1.testBit(i) == true)
				d = (d.multiply(a)).mod(n);
		}
		// To evaluate if the number is prime, we have to check if d is equal to 1, in this case, this number is prime, in the other case, this number is composite
		if(d.compareTo(BigInteger.ONE) != 0)
			return true;
			
		return false;		
	}

	public boolean millerRabinTest(BigInteger n, int s) {

		/************************************************************
		 * Insert the code of Exercise 8b below this comment!
		 ************************************************************/
		BigInteger a;
		// Run this function s time for evaluating if this number n is prime to a random number a
		for(int i = 1; i <= s; i++)
		{
			a = randomInteger(n.subtract(new BigInteger("1")));
			// The witness result will give us if a and n are relatively prime 
			if(witness(a,n))
				// the number n is not prime with a
				return false;
		}
		// the number n is relatively prime with all the random a number so we can consider that n is prime
		return true;
	}

	public BigInteger randomPrime(int bit_length, int s) {

		/************************************************************
		 * Insert the code of Exercise 8d below this comment!
		 ************************************************************/		
		BigInteger n;
		boolean isPrime = false;
		
		do
		{
			//Potential prime number
			n = randomInteger(bit_length);
			
			//Test if the number is prime or not with the millerRabinTest
			isPrime = millerRabinTest(n,s);
		}
		while(!isPrime);//Do until to find a prime number
		
		return n;
	}

}
