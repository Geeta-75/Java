package InputOutput_Stream;

import java.io.*;

public class copyFile {
    public static void main(String[] args) throws IOException { // FileNotFoundException
        FileInputStream f = new FileInputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        FileOutputStream w = new FileOutputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        int i;
        while ((i = f.read()) != -1) {
            w.write((char) i);// System.out.println((char)i);
        }
        System.out.println("Data Copied Successfully..!");
    }

}
