import java.util.Scanner;

/**
 This program calculates the geometric and
 harmonic progression for a number entered
 by the user.
 */

public class Progression
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("This program will calculate " +
                "the geometric and harmonic " +
                "progression for the number " +
                "you enter.");

        System.out.print("Enter an integer: " +
                "greater than or equal to 1: ");

        int input = keyboard.nextInt();

        // Match the method calls with the methods you write
        int geomAnswer = geometricRecursive(input);
        double harmAnswer = harmonicRecursive(input);

        System.out.println("Using recursion:");

        System.out.println("The geometric progression of " +
                input + " is " + geomAnswer);

        System.out.println("The harmonic progression of " +
                input + " is " + harmAnswer);

        // Match the method calls with the methods you write
        geomAnswer = geometricIterative(input);
        harmAnswer = harmonicIterative(input);

        System.out.println("Using iteration:");
        System.out.println("The geometric progression of " +
                input + " is " + geomAnswer);

        System.out.println("The harmonic progression of " +
                input + " is " + harmAnswer);
    }
    // Write the geometricRecursive method

    static int geometricRecursive(int n){

        if(n == 1)
            return 1;
        else {
            return (n * geometricRecursive(n-1)); //n!
        }
    }
    // Write the geometricIterative method

    static double harmonicRecursive(double n){
        if(n <= 1.0)
        {
            return 1.0;
        }
        else
        {
            return n * harmonicRecursive(1.0 / (n - 1.0));
        }
    }
// Write the harmonicRecursive method

    static int geometricIterative(int n){
        int result = 0;
        if(result == 1)
            return result;
        else
            for(int i = 2; i < n; i++){
                result = (i * (i + 1));
            }
        return result;
    }
    // Write the harmonicIterative method
    static double harmonicIterative(int n){
        int result = 0;
        if (result == 1)
            return result;
        else
            for (int i = 2; i < n; i ++){
                result = (i * (1/(i+1)));
            }
        return result;

    }
}

