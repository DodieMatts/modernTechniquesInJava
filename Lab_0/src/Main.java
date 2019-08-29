import java.io.*;
public class Main {

/* This program is intended to read a File and calculate the lowest, highest, Sum and Average
of all the numbers inside the file.
 */

    public static void main(String[] args) throws Exception {
        File nums1 = new File("numbers.txt");
        numAnalysis inputFile = new numAnalysis(nums1);

        inputFile.read();
        System.out.println("The lowest number is: " + inputFile.lowestNumber());
        System.out.println("The highest number is: " + inputFile.highestNumber());
        System.out.println("The total sum is: " + inputFile.totalSum());
        System.out.println("The average is: " + inputFile.average());

        int [][][] storeStorage = new int[50][10][25];
    }
}
