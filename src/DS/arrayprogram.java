import java.util.Scanner;
public class arrayprogram {
    public static void main(String[] args) {;
     int[] arr1={8,6,3,9,1,5,2,4};
     for(int i=0;i<arr1.length;i++){
         if(arr1[i]==5){
             System.out.println("yes");
             break;
         }
         else{
            System.out.println("no");
         }
     }
    }
}
