package com.Assignment;

public class EvenOdd{
    public  static void getEvenNumbers(int number){
        for (int i = 2; i < number - 1; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    public static void getOddNumbers(int number){
        for (int i = 2; i < number; i++) {
            if (i%2 != 0){
                System.out.println(i);
            }else {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Even numbers :");
        EvenOdd.getEvenNumbers(10);
        System.out.println("Odd numbers :");
        EvenOdd.getOddNumbers(10);
    }
}
