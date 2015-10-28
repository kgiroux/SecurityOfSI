package rsa;

import java.math.BigInteger;
import java.util.Vector;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

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
		
		/* Question b */
		BigInteger a = new BigInteger("7019544"), b = new BigInteger("8135112");
		
		//Perform eea algorythm
		EEAResult result = PublicKeyCryptoToolbox.extendedEuclideanAlgorithm(a,b);
		System.out.println("Result1 -- d="+result.getD()+" and x="+result.getX()+" and y="+result.getY()+".");
	
		/* Question c */
		BigInteger a1 = new BigInteger("7186131");
		BigInteger b2 = new BigInteger("8002109");
		
		EEAResult result2 = PublicKeyCryptoToolbox.extendedEuclideanAlgorithm(a1,b2);
		System.out.println("Result2 -- d="+result2.getD()+" and x="+result2.getX()+" and y="+result2.getY()+".");
		System.out.println("Invertible modulo:"+result2.isRelativlyPrime()+" and inverse is:"+result2.getInverse());
		
	}
	
	void modExpExercise() {
		System.out.println("\nExercise 7:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 6b+c below this comment!
		 ************************************************************/

		BigInteger b = PublicKeyCryptoToolbox.modExp(new BigInteger("17"), new BigInteger("1005"), new BigInteger("230"));
		System.out.println("Result of Mod Exp : " +b);
		
		BigInteger result = new BigInteger("17").modPow(new BigInteger("1005"), new BigInteger("230"));
		System.out.println("Result of Mod Exp : " +result);
	}
	
	void randomNumbers() {
		
		System.out.println("\nExercise 8:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 8c below this comment!
		 ************************************************************/
		PublicKeyCryptoToolbox result = new PublicKeyCryptoToolbox();
		for(int i = 0; i<20; i++){
			BigInteger big = result.randomInteger(new BigInteger("102030405060708090"));
			System.out.println("Result : "+ big + " Result compare : " + big.compareTo(new BigInteger("102030405060708090")));
		}

	}

	void primalityTest() {
		System.out.println("\nExercise 9:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 9c+e below this comment!
		 ************************************************************/
		
		//Table verification
		PublicKeyCryptoToolbox publicKeyToolbox =  new PublicKeyCryptoToolbox();
		int s = 100;
		BigInteger a1 = new BigInteger("343232674978653231166402657365997144371953839307928119227511");
		BigInteger a2 = new BigInteger("667984267564412673929015509827448340743034959781814076053617");
		BigInteger a3 = new BigInteger("902857742149935096180418505174605673479122931367283811478172");
		BigInteger a4 = new BigInteger("408025803078911998315951562970145017384911797981108589419277");
		BigInteger a5 = new BigInteger("1040747016400791716218800060097121047453800566864795676123313");
		BigInteger a6 = new BigInteger("341920262248211364330159957004187372102128507551704555404569");
		BigInteger a7 = new BigInteger("880723572255844606588685481136407927962444382553394348261623");
		BigInteger a8 = new BigInteger("1130242628975018265380102543215055338361897468448588898970126");
		
		//Print results
		System.out.format("%s%10s\n", "Integer", "IsPrime?");
		System.out.format("%s%10s\n", a1,publicKeyToolbox.millerRabinTest(a1,s));
		System.out.format("%s%10s\n", a2,publicKeyToolbox.millerRabinTest(a2,s));
		System.out.format("%s%10s\n", a3,publicKeyToolbox.millerRabinTest(a3,s));
		System.out.format("%s%10s\n", a4,publicKeyToolbox.millerRabinTest(a4,s));
		System.out.format("%s%10s\n", a5,publicKeyToolbox.millerRabinTest(a5,s));
		System.out.format("%s%10s\n", a6,publicKeyToolbox.millerRabinTest(a6,s));
		System.out.format("%s%10s\n", a7,publicKeyToolbox.millerRabinTest(a7,s));
		System.out.format("%s%10s\n", a8,publicKeyToolbox.millerRabinTest(a8,s));
		
		//Generate random prime numbers
		System.out.format("Generation of random prime numbers\n");
		System.out.println("=================================\n");
		System.out.format("Prime number with a length of 128 bits => "+ publicKeyToolbox.randomPrime(128,100) +"\n");
		System.out.format("Prime number with a length of 256 bits => "+ publicKeyToolbox.randomPrime(256,100) +"\n");
		System.out.format("Prime number with a length of 512 bits => "+ publicKeyToolbox.randomPrime(512,100) +"\n");
		System.out.format("Prime number with a length of 1024 bits => "+ publicKeyToolbox.randomPrime(1024,100) +"\n");
		
	}

	void run() {
		/*
		 * Uncomment the method after completion of the
                 * respective exercise!
		 */
		eeaResultExercise();
		euclidExercise();
		modExpExercise();
		randomNumbers();
		primalityTest();
	}
	
	public static void main(String[] args) {

		PKCTExercise m = new PKCTExercise();
		m.run();
	}

}
