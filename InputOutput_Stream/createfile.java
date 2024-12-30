package InputOutput_Stream;
import java.io.*;
// import java.io.File;
// import java.io.IOException;

public class createfile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\geeta\\Desktop\\Java\\Interview\\CVSFile");
        if(f.createNewFile()){
            System.out.println("Successfully Created..!");
        }
        else{
            System.out.println("File Already Exit..");
        }
    }
}
