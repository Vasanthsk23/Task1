public class Question3
{
    public static void main(String[] args)
    {
        int input = 876,reverse = 0;
        while(input !=0)
        {
            int output = input % 10;
            reverse = reverse*10 + output;
            input = input/10;

        }
        System.out.println("Output value is : " + reverse);

    }
}
