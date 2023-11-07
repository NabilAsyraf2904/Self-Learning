package Date071123;

import java.util.Scanner;

public class IndeedQuestion {

	static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			//Q1();
			//Q2();
			Q3();
	
		}
	
	public static void partition()
	{
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		
	}
	
	public static void Q1() 
	{
		// write a Java program to swap two numbers using the third variable.
		
		System.out.println("Enter value of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//Original order
		System.out.println("Original order");
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		
		int c = a;
		 a = b;
		 b = c;
		 //After swap
		System.out.println("After swap");
		System.out.println("a :" + a);
		System.out.println("b :" + b);
			
			partition();
	}
	
	public static void Q2()
	{
		//write a Java program to swap two numbers without using the third variable.
		
		System.out.println("Enter value of d and e");
		int d = sc.nextInt();
		int e = sc.nextInt();
		//Original order
		System.out.println("Original order");
		System.out.println("d :" + d);
		System.out.println("e :" + e);
		
		d = d + e;
		e = d - e;
		d = d - e;
		 //After swap
		 System.out.println("After swap");
		System.out.println("d :" + d);
		System.out.println("e :" + e);
		
		partition();
	}
	
	public static void Q3()
	{
		//write me a Java program to find whether a number is prime.
		
		int number = sc.nextInt();
		
		if (number <= 3 ) {
			
			if (number == 1) {
				System.out.println(number + " is not prime number");
			} else {
				System.out.println(number + " is prime number");
			}
			
			
		} else if (number % 2 == 0 || number % 3 == 0) {
			
			System.out.println(number + " is not prime number");
			
		} else {
			
			System.out.println(number + " is prime number");
			
		}
		
		partition();
		
		
	}

}
