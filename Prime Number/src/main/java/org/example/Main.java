package org.example;

import org.example.PrimeNumber.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println("The largest prime number of: " + number + " is:");
        System.out.println(PrimeNumber.theLargestPrimeNumber(number));
    }
}