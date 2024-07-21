import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();

        for (int i = n; i >= 1; i--)
        {
            for(int k=n; k>=i; k--){
                System.out.print(k);
            }
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(i);
            }
            System.out.println ();
        }
    }
}


