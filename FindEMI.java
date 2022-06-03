package corejava;

import java.util.Scanner;

/**
 * This program for
 * find the EMI
 * @author macbook
 */
public class FindEMI {

	/*
	 * This method is for
	 * calculate EMI
	 */
	public static void main(String[] args) {
		double principalAmount;
		float rate;
		int time;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount : ");
		principalAmount = sc.nextInt();// get input for principalAmount

		System.out.println("Enter rate of intrest : ");
		rate = sc.nextFloat();// get input for rate

		System.out.println("Enter number of monthly instalments : ");
		time = sc.nextInt();// get input for time

		sc.close();

		rate=rate/(12*100);// for find rate of interest per annum

		time=time*12;// for find time in year

		double emi = (double)(principalAmount*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);

		System.out.println("EMI is : " + emi);
	}

}
