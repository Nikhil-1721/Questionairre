package com.Assignment;

public class Factorial {
    public int getFactorial(int number){
        if (number <= 2){
            return  number;
        }else {
            return number * getFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Factorial object = new Factorial();
        int factorial = object.getFactorial(8);
        System.out.println("Factorial of 8 is : " + factorial);
    }
}
