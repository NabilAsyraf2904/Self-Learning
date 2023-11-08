package Date081123;

import java.util.Scanner;

public class IndeedQuestion2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Q4();
		//testing

	}
	
	public static void Q4()
	{
		//write a Java program to find the duplicate characters in a string.
		int count = 0;
		String inputString = sc.nextLine();
        char[] characters = inputString.toCharArray();
		
		for (int i= 0; i< characters.length ; i++) {
			count = 1;
			
			for (int j = 0; j < characters.length; j++) {
				
				if (characters[i] == characters[j]) {
					count++;
				}
				
			}
			if (count > 1) {
                System.out.println(characters[i] + " has repeated " + count + " times");
            }
		}
	}

}
