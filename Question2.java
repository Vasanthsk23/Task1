import java.util.Scanner;

public class Question2
{
    public static void main(String [] args)
    {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a value");
        int i = scanner.nextInt();

        if (i<0)
            System.out.println("Negative");
        else
            System.out.println("Positive");


    }
}
