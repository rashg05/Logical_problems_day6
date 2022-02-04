package com.bridgelab.javalogical.logicalprograms;

import java.util.*;

public class StopWatch {
	public static void main(String[] args) {
		double start ;
		double stop;
		double ElapsedTime;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 0 to start the clock");

		start = sc.nextDouble();
		start = System.currentTimeMillis();

		System.out.println("Enter 1 to stop the clock");
		stop = sc.nextDouble();
		stop = System.currentTimeMillis();

		ElapsedTime = (stop - start) / 1000;
		System.out.println("Elapsed time is " + ElapsedTime + " seconds");
		
		sc.close();

	}

}
