public class Leap
{
    public static void main(String[] args)
    {
        if (args.length<1)
        {
            System.out.println("Укажите аргумент!");
        }
        else
        {
            try
            {
                int i = Integer.parseInt(args[0]);
                if ((i % 4) == 0 && (i % 100) == 0 && (i % 400) == 0)
                {
                    System.out.println("leap year!");
                } else
                {
                    System.out.println("not a leap year");
                }
            } catch (NumberFormatException ex)
            {
                System.out.println("Введите число!");
            }
        }
    }
}
