package file1;

import java.io.FileReader;
import java.io.IOException;

public class displayprogram {
    public static void main(String[] args) {
        char[] array = new char[1000];
        try {
            FileReader input = new FileReader("C:\\Users\\aswin\\Downloads\\38833FF26BA1D.UnigramPreview_g9c9v27vpyspw!App\\program007\\progra.txt");

            int charsRead = input.read(array);
            if (charsRead != -1) {
                System.out.println(new String(array, 0, charsRead));
            }

            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
