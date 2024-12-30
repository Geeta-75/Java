package InputOutput_Stream;

import java.io.FileInputStream;

public class FileInput_Stream {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
            int i = f.read();
            System.out.println((char) i);
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
