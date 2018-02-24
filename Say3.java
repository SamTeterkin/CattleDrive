public class Say3
{
    public static void main(String[] args)
    {
        double a = 0;
        for (int i = 0; i < 1001; i++)
        {
            a = a + 0.1;
        }
        if (a == 100)
        {
            System.out.println("Сумма равна 100");
        } else {
            System.out.println("Сумма не равна 100. Сумма:" + a);
        }
    }
}
