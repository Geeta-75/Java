package InputOutput_Stream;
import java.io.*;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        try {
      FileReader r = new FileReader ("C:\\Users\\geeta\\Desktop\\Java\\InputOutput_Stream\\File.text");
      try{
      int i ;
      while((i = r.read()) != -1 ){
           System.out.print((char)i);
      }
    }
    finally{
        r.close();
    } 
}
catch (IOException e){
    System.out.println("Exception Handled..!");
}
    }
}


    
    

