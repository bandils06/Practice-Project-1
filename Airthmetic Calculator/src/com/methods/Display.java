package com.methods;
import java.util.Scanner;

public class Display {
	public void output(int operation) {
		MethodCalculations method = new MethodCalculations();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Values: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		if (operation == 1)
			System.out.println(a + " + " + b + " = " + method.Add(a,b));
		else if (operation == 2) 
			System.out.println(a + " - " + b + " = " + method.Subtract(a, b));
		else if (operation == 3)
			System.out.println(a + " * " + b + " = " + method.Multiply(a, b));
		else if (operation == 4) 
			System.out.println(a + " / " + b + " = " + method.Divide(a, b));
	}
}