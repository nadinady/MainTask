import java.util.Scanner;
import java.util.Random;

public class Task {
    public static void main (String[] args){
        int number;
        try {
            System.out.println("Enter the number of random numbers");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();
            printRandom(number);
        }
        catch (Exception e) {
            System.out.println("Enter only number");
        }
        }

    public static void printRandom (int number) {
        int[] result;
        String resultNoNextLine;
        resultNoNextLine = new String();
        result = new int[number];
        Random myRandom = new Random();
        for(int i = 0; i < number; i++){
            result[i] = myRandom.nextInt();
            System.out.println(result[i]);
            resultNoNextLine += result[i] + " ";
        }
            System.out.print(resultNoNextLine);


    }
}
