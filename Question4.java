import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("value 1 : ");
        int a = scanner.nextInt();

        System.out.println("value 2 : ");
        int b = scanner.nextInt();

        System.out.println("value 3 : ");
        int c =scanner.nextInt();




        System.out.println("Smallest value " + Math.min(Math.min(a,b),c));
       // System.out.println("Smallest value " + Math.min(Math.min(12,78),8));
    }
}
