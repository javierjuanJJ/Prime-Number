package org.example.PrimeNumber;

public class PrimeNumber {
    public static boolean isPrimeNumber(long number) {
       boolean isPrimeNumber = false;

        for (int counter = 2; counter < number && !isPrimeNumber; counter++) {
            // System.out.println(number % counter);
            isPrimeNumber = number % counter == 0;
        }

       return isPrimeNumber;
    }
    public static long theNearestPrimeNumber(long number) {
        long nearestPrimeNumber = number;
        for (int counter = 2; counter < number && (nearestPrimeNumber == number); counter++) {

            nearestPrimeNumber = isPrimeNumber(nearestPrimeNumber) && number % counter == 0  ? counter : number;
        }
        return nearestPrimeNumber;
    }

    public static long theLargestPrimeNumber(long number) {
        long largestPrimeNumber = number;
        // System.out.println(isPrimeNumber(largestPrimeNumber));

        long result = 0;

        while (largestPrimeNumber > 1){
            long divisor = theNearestPrimeNumber(largestPrimeNumber);
         //   System.out.println("divisor " + divisor);

            if (result < divisor){
                result = divisor;
            }

            largestPrimeNumber /= divisor;
           // System.out.println("cociente " + cociente);
        }

        return result;
    }

}
