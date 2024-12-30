package InputOutput_Stream;
import java.io.*;
public class fileInfo {
    public static void main(String[] args) {
        File f = new File ("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        if(f.exists()){
            System.out.println("File Name : " + f.getName());
            System.out.println("File Location : " + f.getAbsolutePath());
            System.out.println("File Writable : " + f.canWrite());
            System.out.println("File Redable : " + f.canRead());
            System.out.println("File Size : " + f.length());
            //System.out.println("Removed : " + f.delete());
        }
        else{
            System.out.println("File Doesn't exits");
        }
    }
    
}
