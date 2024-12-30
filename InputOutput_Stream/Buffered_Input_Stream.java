package InputOutput_Stream;

import java.io.*;

public class Buffered_Input_Stream {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
        fin.close();
    }

}
