//Students database using collection 
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        // mini database creation
        HashMap<Integer,String> m = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of entries you want to add: ");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.print("set roll number 1-"+a +" : ");
            int k=sc.nextInt();
            Scanner ss=new Scanner(System.in);
            System.out.print("enter name : ");
            String v=ss.nextLine();
            m.put(k,v);
        }
        System.out.println("data base : ");
        for (Map.Entry<Integer,String> entry : m.entrySet()) {
            System.out.println( entry.getKey() +" "+ entry.getValue());
        }
        System.out.print("search roll number for find : ");
        int x=sc.nextInt();
        for(int i=1;i<a;i++){
            if(x==i)
                System.out.print(m.get(i));
        }




    }
}