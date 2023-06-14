package Task1;

import java.util.Scanner;

public class NaturalNumber {
			private static Scanner sc;
	public static void main(String[] args) {
		
		int number;
		int i;
		sc =new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		for(i = 1; i <= number; i++)
		{
			System.out.print(i +"\t"); 
		}
	}
}

			

	


