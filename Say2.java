public class Say2
{
    public static void main(String[] args)
    {
        try
        {
            String tens[] =
                    {
                            "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
                    };
            String oe[] =
                    {
                            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
                    };
            int i = Integer.parseInt(args[0]);
            if (i==0) {
                System.out.println("zero");
            } else
            {
                if (i <= 20 && i > 0)
                {
                    System.out.println(oe[i]);
                } else
                {
                    if (i < 100 && i > 0)
                    {
                        System.out.println(tens[i / 10] + " " + oe[(i % 10)]);
                    } else
                    {
                        if (i < 1000 && i > 0)
                        {
                            System.out.println(oe[i / 100] + " hundred " + tens[i % 10] + " " + oe[i % 10]);
                        } else
                        {
                            if (i < 10000 && i > 0)
                            {
                                System.out.println(oe[i / 1000] + " thousand " + oe[i % 10] + " hundred " + tens[i % 10] + " " + oe[i % 10]);
                            }
                            else {
                                if (i < 100000 && i > 0) {
                                    System.out.println(tens[i / 100] + " thousand " + oe[i % 10] + " hundred " + tens[i % 10] + " " + oe[i % 10]);
                                }
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Введите число!");
        }

    }
}
