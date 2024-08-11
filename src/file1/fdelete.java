package file1;
import java.io.File;
public class fdelete {
    public static void main(String[] args) {
        File file=new File("c:\\x\\del.txt");

        boolean value=file.delete();
        if(value){
            System.out.println("The file is deleted");
        }
        else{
            System.out.println("The file is not deleted ");
        }
    }

}
