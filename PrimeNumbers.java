import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) throws Exception {


	
		int number;
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();

		if(number <= 0)  {
			throw new Exception("Invalid number");
				}

		System.out.println("Prime numbers between 1 and " + number + " are :");

		for(i = 1; i <= number; i++) {

			 int count = 0;

			 for (int j = 2; j <= i - 1; j++) {
				 if (i%j == 0) {
					count++;
				 }
				 
			}
			 if (count == 0) {
					System.out.println(i);
			}

			else {
					count  = 0;
			}
		 }
	}
	
	 
}
