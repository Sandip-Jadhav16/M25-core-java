package org.tnsindia.Operator;

import java.util.Scanner;
public class ArithmaticOperator {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Integer Noumber:");
		int a=s.nextInt();
		System.out.println("Enter Second Integer Noumber:");
		int b=s.nextInt();
		int res= a+b;
		System.out.println("The Addition of Two Number is:"+res);
		s.close();
		
		
		

	}

}
