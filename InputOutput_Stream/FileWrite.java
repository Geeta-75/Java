package InputOutput_Stream;
import java.io.*;
public class FileWrite {
    public FileWrite(String string) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
       try{
        FileWriter f = new FileWriter("C:\\Users\\geeta\\Desktop\\Java\\Interview\\CVSfile");
        try{
          
            f.write("  1       |          1234          |    Shiv    |       A+     |");
           
        }
        finally{
            f.close();
        }
        System.out.println("Successfull data wrote in file..");
       }
       catch(IOException i) {
           System.out.println(i);
       }
          }

    public void write(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'write'");
    }

    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }  }


    

