package Daily_Program;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        //0 1 153 370 371 407  1*1*1+5*5*5+3*3*3=153
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        int k;
        k=a;
        int c=0;
         int b,d;
        while(a!=0){
            b=a%10;
            c+=b*b*b;
            a/=10;

        }
        if(c==k){
            System.out.println("it is amstrong");
        }
        else{
            System.out.println("it not a amstrong");
        }
    }
}
