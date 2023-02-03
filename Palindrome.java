import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


// Program to check if a number is Palindrome or not

public class Palindrome{

	public static void main(String args[]){

	
		int remainder;
		int reversed = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int initialValue = number;

		

		while(number > 0){

			remainder = number%10;
			reversed = reversed*10 + remainder;
			number = number/10;
		}

		if(reversed == initialValue){
			System.out.println(initialValue + " is Palindrome");

		}

		else {

			System.out.println(initialValue + " is NOT Palindrome");
		}

	}
}