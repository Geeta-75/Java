package InputOutput_Stream;
import java.io.*;
public class ByteArray_Output_Stream {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
        //FileOutputStream f2 = new FileOutputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File2.text");
        ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(f);    
      //bout.writeTo(f2);    
        
      bout.flush();    
      bout.close();    
      System.out.println("Success...");   
    }
    
}
