public class Say
{
    public static void main(String[] args)
    {
        try
        {
            String tens[] =
                    {
                            "n/a", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
                    };
            String oe[] =
                    {
                            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
                    };
            int i = Integer.parseInt(args[0]);
            if (i <= 20 && i>0)
            {
                System.out.println(oe[i]);
            } else
            {
                if (i<100 && i>0)
                {
                    System.out.println(tens[i / 10] + " " + oe[(i % 10)]);
                } else {
                    System.out.println("Введите число больше 1, но меньше 100");
                }
                }
        } catch (NumberFormatException ex) {
            System.out.println("Введите число!");
        }

    }
}
