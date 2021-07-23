class fizz_buzz {
    public static void main(String[] args) {

        int fizzbuzz = 1;

        while (fizzbuzz <100)
        {
            if (fizzbuzz % 3 == 0 && fizzbuzz % 5 == 0)
            {
                System.out.println("fizzbuzz");
            }
            if (fizzbuzz % 3 == 0)
            {
                System.out.println("fizz");
            }
            if (fizzbuzz % 5 == 0)
            {
                System.out.println("buzz");

            }
            else
            {
                System.out.println(fizzbuzz);
            }

  

             fizzbuzz+= 1;
        }

    }
}