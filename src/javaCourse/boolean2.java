package javaCourse;

public class boolean2 {

        public static void main(String[] args) {
            int x = 0;
            boolean result = (x++ == 0) && (x-- > 0) || (x++ == 1);
            System.out.println(result);
            System.out.println(x);
        }
    }

