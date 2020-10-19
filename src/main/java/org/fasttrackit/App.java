package org.fasttrackit;

public class App
{
    public static void main( String[] args ) {
        Calculator calculator = new Calculator();
        int x = 135;
        int y = 632;

        System.out.println("Calculating the sum of " +  x + " and" + y);
        int sum = calculator.sum(x,y);
        System.out.println("The sum is " + sum);

        System.out.println("Calculating the product of " + x + " and" + y);
        int product = calculator.multiply(x,y);
        System.out.println("The product is" + product);

        System.out.println("Dividing " + x + " by " + y);
        double result = calculator.divide(x,y);
        System.out.println("The result is " + result);
        }
    }
