public class ternary
{
    public static void main (String a[])
    {
         int n = 4;
         int result = 0;

         if (n%2 == 1)
            result = 13;
        else
        result = 20;

        //ternary sign ?:

        // result = n%2 == 1? 13:20;
        System.out.println(result);
    }
}