public class Hundred
{
    public static void main(String[] args)
    {
        try
        {
            for (int i = 0; i < 100; i++)
            {
                if (i % 7 == 0 && i != 0)
                {
                    System.out.println();
                }
                System.out.print(args[0] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Необходимо что-то прописать в консоль!");
        }
    }
}
