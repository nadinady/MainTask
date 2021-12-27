

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        String UserName;
        Scanner in = new Scanner(System.in);
        System.out.println( "What is your name?" );
        UserName = in.next();
        PrintHello(UserName);
    }
    public static void PrintHello(String UserName) {
       if(!UserName.matches("[а-яА-Яa-zA-Z]+(\\-*[а-яА-Яa-zA-Z]+)+"))
        {
            System.out.println("Please enter only letters or '-'");
        }
        else
        {
            System.out.println("Hello " + UserName);
        }
    }
}

