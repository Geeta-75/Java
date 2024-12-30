package InputOutput_Stream;

import java.io.*;

public class DataOutput_Stream {
     public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File2.text");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
}
}
