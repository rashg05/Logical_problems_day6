package com.bridgelab.javalogical.logicalprograms;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkPrime(number);
		sc.close();
	}
	public void checkPrime(int num) {
		for (int i = 0; i <= num; i++) {
			if (i == 1 || i == 2) {
				System.out.print(i + "\t");
			}
			else if (i % 2 != 0) {
				System.out.print(i + "\t");
			}

		}
	}

}
