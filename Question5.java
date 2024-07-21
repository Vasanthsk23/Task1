import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        int i = scanner.nextInt();
        int discount = 0;


        if (i < 500) {
            System.out.println(i);
        } else if (i >= 500 && i <= 1000) {
            discount = i * 10 / 100;
            System.out.println(i - discount);
        } else if (i > 1000) {
            discount = i * 20 / 100;
            System.out.println(i - discount);
        }
    }

    }

