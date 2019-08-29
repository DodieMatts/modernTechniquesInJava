import java.io.*;
import java.util.Scanner;

//initializes array and file
public class numAnalysis {

    private double arr[];
    private File numbers;

    public numAnalysis(File nums) {
        numbers = nums;
        arr = new double[12];
    }

    //create method to read numbers from file
    public void read()throws IOException {
        Scanner input = new Scanner(numbers);

        for (int i=0 ; i < arr.length; i++) {
            arr [i] = input.nextDouble();
        }
    }

    // method to get lowest number from array list
    public double lowestNumber() {

        double lowest = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        return lowest;
    }
    //Method to get highest number from array list

    public double highestNumber() {

        double highest = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        return highest;
    }
//method to get highest number from array List
    public double totalSum(){
        double sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }
//method to get average from the array
    public double average() {
        double total = 0;
        double avg;

        for(int i = 0; i < arr.length;i++){
            total += arr[i];
        }

        avg = total / arr.length;

        return avg;
    }

}
