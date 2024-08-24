/**
 * This the first assignment for the CEN 4802C course. This class works with the
 * Fibonacci sequence by using an integer as a position in the sequence to find the
 * number in that exact position. It consists of two methods, one being the 'fibonacci'
 * method and the other being the main method which calls on the first one to achieve
 * the program's purpose.
 */
public class Assignment1
{
    /**
     * The main method calls on the 'fibonacci' method and outputs the result using the
     * integer 'n' which in this case equals to 10; the result outputs to 55.
     * @param args Used for the command line arguments passed to the program.
     */
    public static void main(String[] args)
    {
        int n = 10;
        int result = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }

    /**
     * This non-void method makes the calculation to find the number in the Fibonacci sequence depending
     * on the position.
     * @param n This is the term in the Fibonacci sequence.
     * @return The number in the nth term.
     */
    public static int fibonacci(int n)
    {
        if (n <= 1)
        {return n;}

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}