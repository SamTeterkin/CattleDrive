import java.math.BigInteger;

public class Grains
{
    public static void main(String[] args)
    {
        BigInteger grains = new BigInteger("1");
        BigInteger bigTwo = new BigInteger("2");
        int i = 0;
            for (int j = 1; j < 64; j++)
            {
                i++;
                grains = grains.multiply(bigTwo);
                System.out.println("square " + i + ": " + grains + " grains");
            }
    }
}
