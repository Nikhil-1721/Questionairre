public class PrimeNumbers {
	public static void main(String[] args) {
		int number;
		int i;
		for(number = 1; number <= 50; number++) {
			 int count = 0;
			 for (i = 2; i <= number - 1; i++) {
				 if (number%i == 0) {
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
