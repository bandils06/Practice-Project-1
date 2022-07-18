package com.main;

import com.methods.Display;
import com.methods.MethodCalculations;
import java.util.Scanner;

public class Calculator extends MethodCalculations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.println("Select Operation:\n1 for Addition(+)\n"
				+ "2 for Subtraction(-)\n3 for Multiplication(*)\n4"
				+ "for Division(/)\n0 for Exit");
			int operationNum = sc.nextInt();
		
			if (operationNum == 0) {
				System.out.println("Thank-you for using me!...\nBye...");
				break;
			}
			else if (operationNum > 4 || operationNum < 0) {
				System.out.println("Wrong input...\nPlease select the correct "
						+ "option.");
				continue;
			}
			else {
				Display result = new Display();
				result.output(operationNum);
				}
			System.out.println("Do you want to perform another operation?:"
					+ "\n1 for Yes / 0 for No");
			if(sc.nextInt() == 0) {
				System.out.println("Thank-you for using me!...\nBye...");
				break;
			}
		}
	}
}
