package Daily_Program;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=0;
        int t2=1;
        int temp;
        System.out.println("0 ");
        System.out.println("1");

        //System
        for(int i=0;i<=n;i++){
            temp=t1+t2;
            t1=t2;
            t2=temp;

            System.out.println(t2);

        }
        //System.out.println(t2);

    }
}
