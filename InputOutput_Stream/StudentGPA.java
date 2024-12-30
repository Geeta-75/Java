package InputOutput_Stream;

import java.io.*;
import java.util.List;
import java.util.TreeSet;

public class StudentGPA {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Users\\geeta\\Desktop\\Java\\Interview\\CVSFile");
            try {
                int i;
                while ((i = r.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                r.close();
            }
        } catch (IOException e) {
            System.out.println("Exception Handled..!");
        }
        System.out.println("                                                   ");
        System.out.println("                                                       ");
        TreeSet t = new TreeSet();
        t.add("B");
        t.add("A");
        t.add("C");
        t.add("+A");
        System.out.println( " Sorted : " + t);
    
    }

    // Grade Point Average
}

