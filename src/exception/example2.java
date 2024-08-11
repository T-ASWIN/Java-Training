package exception;

public class example2 {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;
        try {
            data = i / j;
        } catch (Exception e) {
            System.out.println(i / (j + 2));
        } finally {
            System.out.println("finally block is executed");
        }
    }
}
