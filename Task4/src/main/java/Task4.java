import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
            String stringToParse;
            Integer [] arr;
            stringToParse = scannerString();
            if (stringToParse.matches("(\\-?\\d+(\\ )?)+")) {
            arr=stringToInt(parseString(stringToParse));
                    System.out.println("Sum = " + sum(arr));
                    System.out.print("Multiply = " + multiply(arr));
                }
            else System.out.println("Incorrect input");
            }

   static String scannerString () {
        String stringToParse;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers");
        stringToParse = in.nextLine();
        return stringToParse;
    }
    static String [] parseString (String stringToParse) {
        return stringToParse.split(" ");
    }
    static Integer [] stringToInt (String [] stringParse) {
        int i=0;
        Integer[] intArray = new Integer[stringParse.length];
            for (String iter : stringParse) {
                intArray[i] = Integer.parseInt(iter);
                i++;
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
