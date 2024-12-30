package InputOutput_Stream;

import java.io.*;

public class Buffered_Output_Stream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Hey ! I am Riya.....";
        byte b[] = s.getBytes();
        fout.write(b);
        fout.flush();
        fout.close();
        bout.flush();
        System.out.println("success.....");
    }

}
