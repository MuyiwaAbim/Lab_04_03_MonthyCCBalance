public class main {
    static double interestRate = 1.17;
    static double originalAmount = 5000;
    static int firstMonth = 25;
    static int secondMonth = 25;

    public static void main (String [] args)
    {
        double firstMonth = originalAmount * interestRate;
        System.out.println("The amount due after the first month is " + firstMonth + " dollars.");
        double secondMonth = firstMonth * interestRate;
        System.out.println("The amount due after the second month is " + secondMonth + " dollars.");

    }
}