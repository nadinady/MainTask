import java.util.Scanner;
public class General {

    public static void main (String[] args) {
        String tempStringToReverse;
        int size;
        char[] stringToReverse;
        System.out.println("Please enter the string");
        Scanner in = new Scanner(System.in);
        tempStringToReverse = in.nextLine();
        size = tempStringToReverse.length();
        if (size > 0)
        {
            /*stringToReverse = new char[size];
            for (int i = 0; i < size; i++) {
                stringToReverse[i] = tempStringToReverse.charAt(i);
            }
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(stringToReverse[i]);
            }*/
            for (int i = size-1; i >= 0; i--) {
               System.out.print(tempStringToReverse.charAt(i));
            }
        }
        else System.out.println("The string doesn't be empty");
    }


    }


