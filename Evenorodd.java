public class Evenorodd
{
    public static void main(String[] args)
    {
        try
        {
        int i = Integer.parseInt(args[0]);
            if ((i % 2) == 0)
            {
                System.out.println(args[0] + " even");
            } else
            {
                System.out.println(args[0] + " odd");
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Введите число!");
        }
    }
}
