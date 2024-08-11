package basicprogram;
import java.util.Scanner;
//import java.util.
public class SwappingVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int temp;
        temp=a;
        a=b;
        b=temp;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    }
}
