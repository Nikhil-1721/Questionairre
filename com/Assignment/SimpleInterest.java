package com.Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public float calculateSI(float principle, int tenure, float rate) {
        float result = (principle * tenure * rate) / 100;
        return result;
    }

    public static void main(String[] args) {
        SimpleInterest object = new SimpleInterest();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle:");
        float principle = input.nextFloat();
        System.out.println("Enter the Tenure:");
        int tenure = input.nextInt();
        System.out.println("Enter the Rate of Interest:");
        float interest = input.nextFloat();
        float result = object.calculateSI(principle, tenure, interest);
        System.out.println("Interest earned : " + result);
    }
}