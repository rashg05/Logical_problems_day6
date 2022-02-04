package com.bridgelab.javalogical.logicalprograms;

import java.util.*;

class CouponCheck{
	Scanner scanner = new Scanner(System.in);
	
	public int randomNumber(int range) {

		return (int) (Math.random() * range);
	}
	
	public int distinctCoupon(int range) {
		boolean[] arr = new boolean[range];
		int count = 0;
		int distinct = 0;
		while (distinct < range) {
			int value = randomNumber(range);
			System.out.print(value + " ");
			if (!arr[value]) {
				distinct++;
				arr[value] = true;
				System.out.print(arr[value] + " ");
			}

			count++;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("index " + i + " values " + arr[i] + "\n");
		}
		return count;

	}
}


public class CouponNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CouponCheck utility = new CouponCheck();
		System.out.println("Enter number for Generate Coupons");
		int range = scanner.nextInt();
		int count=utility.distinctCoupon(range);
		System.out.println(count + " N times loop runs for finding distinct");
		scanner.close();

	}

}
