package collections;
import java.util.ArrayList;
public class indexvalue {
    public static void main(String[] args) {
        ArrayList<String>animals=new ArrayList<>();

        animals.add("Ca");
        animals.add("dog");
        animals.add("cow");
        animals.add("rat");
        animals.add("mouse");

        System.out.println("Arraylist:"+animals);
        String str=animals.get(1);
        System.out.println(animals.indexOf("dog"));
        System.out.println(animals.indexOf("rat"));
        System.out.println(animals.indexOf("moouse"));
    }
}
