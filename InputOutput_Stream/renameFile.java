package InputOutput_Stream;
import java.io.*;
public class renameFile {
    public static void main(String[] args) {
        File r = new File("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        File f = new File("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\Riya.text");
        
        if(f.exists()){
         System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exits..!");
        }
        
    }
}
