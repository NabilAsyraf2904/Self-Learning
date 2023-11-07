package Date071123;

import java.util.Scanner;

public class IndeedQuestion {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Q1();

	}
	
	public static void Q1() {
		// write a Java program to swap two numbers using the third variable.
		
				int a = sc.nextInt();
				int b = sc.nextInt();
				//Original order
				System.out.println("a :" + a);
				System.out.println("b :" + b);
				
				int c = a;
				 a = b;
				 b = c;
				 //After swap
				System.out.println("a :" + a);
				System.out.println("b :" + b);
	}

}
