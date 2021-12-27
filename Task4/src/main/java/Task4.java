import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
            String stringToParse;
            Integer [] arr;
            stringToParse = scannerString();
            arr=stringToInt(stringToParse);
                if(Arrays.stream(arr).allMatch(Objects::nonNull)) {
                    System.out.println("Sum = " + sum(arr));
                    System.out.print("Multiply = " + multiply(arr));
            }
        }

   static String scannerString () {
        String stringToParse;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers");
        stringToParse = in.nextLine();
        return stringToParse;
    }
    static Integer [] stringToInt (String stringToParse) {
        String [] tempString;
        int i = 0;
        tempString = stringToParse.split(" ");
        Integer[] intArray = new Integer[tempString.length];
        try {
            for (String iter : tempString) {
                intArray[i] = Integer.parseInt(iter);
                i++;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Incorrect input format");
            Arrays.fill(intArray,null);
        }

        return intArray;




    }
    static int sum (Integer [] arr) {
        int sum =0;
        for (Integer tempArr: arr) {
            sum +=tempArr;
        }
        return sum;

    }
    static int multiply (Integer [] arr) {
        int mult =1;
        for (Integer tempArr: arr) {
            mult *=tempArr;
        }
        return mult;
    }
}
