package basicprogram;

public class remainder  {
    public static void main(String[] args) {
        double dividend = 10.0;
        double divisor = 60;

        double remainder = Math.IEEEremainder(dividend, divisor);

        System.out.println("Remainder: " + remainder);
    }
}


