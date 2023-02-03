import java.util.*;

//Program to print Fbonacci sequence in Java

class Fibonacci{


	public static void main(String args[]){

	int a = 0;
	int b = 1;
	
	
	int c = 0;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int input = sc.nextInt();

	for(int i = 1; i <= input; i++){
		
		c = a + b;
		  
		a = b;
		b = c;
		
		System.out.print(c + " ");
		

		}

	}
	
}