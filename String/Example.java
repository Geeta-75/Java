package String;
// public class Exercise {

//     public static void main(String[] args) {
//         String str = "Java Exercises!";
//         System.out.println("Original String = " + str);
//         int index1 = str.charAt(0);
//         int index2 = str.charAt(10);
//         System.out.println("The character at position 0 is  " + (char)index1);
//         System.out.println("The character at position 10 is " + (char)index2);
//     }
// }

import java.util.Calendar;

// Exercise 2 by using concat() Method 

// public class Exercise{
//     public static void main(String[] args) {
//         String str = "PHP Exercises and ";
//         String str2 = "Python Exercises ";
//         System.out.println("String 1 : " + str );
//         System.out.println("String 2 : " + str2);
//         String str3 = str.concat(str2);
//         System.out.println("The concatenated string : " + str3);
//     }
// }

// Exercise 3

// public class Exercise{
//     public static void main(String[] args) {
//         String str = "example.com";
//         String str2 = "Example.com";
//         CharSequence cs = "example.com";
//         System.out.println("Comparing "  +str + " and "  + cs + " : " + str.contentEquals(cs));
//         System.out.println("Comparing "  + str2 + " and "  + cs + " : " + str2.contentEquals(cs) );

//     }
// }

// Exercise 4 

// public class Example{
//     public static void main(String[] args) {
//         String str = "Phython Exercises ";
//         String str2 = "Phython Exercise";
//         String ends_str = "se";
//         boolean ends1 = str.endsWith(ends_str);
//         boolean ends2 = str2.endsWith(ends_str);
//         System.out.println("\" " + str  + "\" ends with " + "\"" + ends_str + "\" ? " + ends1 );
//         System.out.println("\" " + str2 + "\" ends with " + "\"" + ends_str +"\" ? " + ends2);
//     }
// }

// Exercise 5

public class Example {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time : ");
        System.out.format("Date : " + "%tB %te , %tY%n ", c, c, c);
        System.out.format("Time : " + "%tl:%tM %tY%n ", c, c, c);
    }
}

// Exercise 6
// public class Example{
// public static void main(String[] args) {
// String str ="example.com";
// System.out.println("The example.com length is " + str.length());
// }

// }

// Exercise 7

// public class Example {

// public static void main(String[] args) {
// String str = "The quike brown fox jumps over the lazy dogs .";
// String new_str = str.replace('d', 'f');
// System.out.println("Original string: " + str);
// System.out.println("New String : " + new_str);
// }
// }

// Exercise 8

// public class Example {

// public static void main(String[] args) {
// String str = "Red is favorite color.";
// String str2 = "Orange is also my favorite color.";
// String start_str = "Red";
// boolean starts1 = str.startsWith(start_str);
// boolean starts2 = str2.startsWith(start_str);
// System.out.println(str + " starts with " + start_str + " ? " + starts1);
// System.out.println(str2 + " starts with " + start_str + " ? " + starts2);
// }
// }
