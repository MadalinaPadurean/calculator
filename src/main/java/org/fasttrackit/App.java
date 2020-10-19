package org.fasttrackit;

public class App
{
    public static void main( String[] args ) {

        Calculator calculator = new Calculator();
        double m = 135.65;
        double n = 632.34;

        System.out.println("Calculating the sum of " +  m + " and" + n);
        double doubleSum = calculator.sum(m,n);
        System.out.println("The sum is " + doubleSum);

        System.out.println("Calculating the product of " + m + " and" + n);
        double doubleProduct = calculator.multiply(m, n);
        System.out.println("The product is" + doubleProduct);

        System.out.println("Dividing " + m + " by " + n);
        double doubleResult = calculator.divide(m,n);
        System.out.println("The result is " + doubleResult);
        }
    }
