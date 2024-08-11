package file1;
import java.io.File;
public class create {
    public static void main(String[] args) {
        File file=new File("c:\\x\\del.txt");
        {
            try{
                boolean value=file.createNewFile();
                if(value){
                    System.out.println("The new file is created");
                }
                else{
                    System.out.println("The new file is not created");
                }
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
    }


}
