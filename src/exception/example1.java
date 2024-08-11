package exception;

public class example1 {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            System.out.println("anything divided by zero is infinity");
        } catch (ArithmeticException a) {
            System.out.println(a);
        }
        System.out.println('\n' + "Anything divided by zero is infinity. . . .");
    }
}
