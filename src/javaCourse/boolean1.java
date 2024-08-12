package javaCourse;

public class boolean1 {
        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;
            boolean c = true;

            boolean result = (a || b) && !(b && c) || (b || !a && c);
            System.out.println(result);
        }
    }


