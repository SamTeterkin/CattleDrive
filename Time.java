import java.time.temporal.ValueRange;

public class Time
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                System.out.print(leftText(String.valueOf(i*j), 3) + " ");
            }
            System.out.println();
        }
    }
    static String leftText( String s , int newLen )
    {
        while ( s.length() < newLen )
        {
            s= " " + s;
        }
        return s ;
    }

}
